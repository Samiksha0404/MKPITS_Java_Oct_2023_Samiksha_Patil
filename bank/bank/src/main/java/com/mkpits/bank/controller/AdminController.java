package com.mkpits.bank.controller;

import com.mkpits.bank.dto.response.AccountResponseDto;
import com.mkpits.bank.dto.EmployeeRequestDto;
import com.mkpits.bank.dto.UserRequestDto;
import com.mkpits.bank.dto.response.UserResponseDto;
import com.mkpits.bank.service.IAccountService;
import com.mkpits.bank.service.IEmployeeService;
import com.mkpits.bank.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AdminController {

    @Autowired
    IAccountService iAccountService;

    @Autowired
    IUserService  iUserService;


    @Autowired
    IEmployeeService iEmployeeService;


    @GetMapping("/admin/dashboard")
    public  String adminDashboard(){
        return "/admin/admin";
    }
    @GetMapping("/admin/dashboard/usermanagement")
    public  String adminUserManagement(Model model){

        List<UserResponseDto> userGetResponseDtoList =  iUserService.getAllUsers();
        model.addAttribute("userManagement",userGetResponseDtoList);
        return "admin/userManagement";
    }
    @PostMapping("/admin/dashboard/usermanagement/register")
    public String registerUser(@ModelAttribute UserRequestDto userRequestDto, Model model) {
        UserResponseDto userResponseDto = iUserService.createUser(userRequestDto);
//        model.addAttribute("user", userResponseDto);

        List<UserResponseDto> userRequestDtoList =  iUserService.getAllUsers();
        model.addAttribute("userManagement", userRequestDtoList);

        return "admin/userManagement"; // The view name of the success page
    }

    @GetMapping("/admin/dashboard/employeemanagement/registrationform")
    public String showRegistrationForm(Model model) {
        model.addAttribute("userRequestDto", new UserRequestDto());
        return "user/registration";
    }

    @GetMapping("/admin/dashboard/employeemanagement")
    public  String adminEmployeeManagement(Model model){
        List<EmployeeRequestDto> employeeGetResponseDtoList =  iEmployeeService.getAllEmployees();
        model.addAttribute("employeeManagement",employeeGetResponseDtoList);
        return "/admin/employeeManagement";
    }

    @GetMapping("/admin/dashboard/customerdetails/{userId}")
    public String adminCustomerAccounts(@PathVariable("userId") Integer userId, Model model) {
        UserResponseDto userReponseDto = iUserService.getUserByIdUser(userId);
        List  <AccountResponseDto> accountResponceDto=iAccountService.getAllUserAccounts(userId);
        model.addAttribute("customerDetalis", userReponseDto);
        model.addAttribute("customerDetailsFromAccount",accountResponceDto);
        return "admin/customeraccounts";
    }

    @GetMapping("/admin/dashboard/usermanagment/updateForm/{userId}")
    public String userUpdateRegistrationForm(@PathVariable("userId") Integer userId, Model model) {

        //to get detail of perticular id of user
        UserResponseDto userResponseDto = iUserService.getUserByIdUser(userId);


        model.addAttribute("customerDetails", userResponseDto);

        return "/admin/updateRegistration";
    }

    //update post
    @PostMapping("/admin/dashboard/usermanagement/update/{id}")
    public String updatePartialUser(@PathVariable("id") Integer id, @ModelAttribute UserRequestDto userRequestDto, Model model) {
        userRequestDto.setId(id);
        UserResponseDto userResponseDto = iUserService.updateUser(userRequestDto);

        List<UserResponseDto> users = iUserService.getAllUsers();
        model.addAttribute("userManagement", users);
        return "/admin/userManagement";
    }


    //delete
    @GetMapping("/admin/dashboard/customerdetails/delete/{accNo}")
    public String deleteAccount(@PathVariable("accNo") String accNo , Model model) {

        Integer userId = iAccountService.getUserIdByAccountNo(accNo);

        AccountResponseDto accountResponseDto = iAccountService.deleteAccount(accNo);


        UserResponseDto userDto = iUserService.getUserByIdUser(userId);
        List<AccountResponseDto> accountResponseDtoList = iAccountService.getAllUserAccounts(userId);

        model.addAttribute("customerDetalis", userDto);
        model.addAttribute("customerDetailsFromAccount", accountResponseDtoList);
        return "admin/customeraccounts";

    }



    @GetMapping("/admin/dashboard/usermanagement/addaccountregistration/{userId}")
    public String showAddAccountRegistrationForm(@PathVariable("userId") Integer userId, Model model) {
        model.addAttribute("userRequestDto", new UserRequestDto());
        model.addAttribute("userId", userId);
        return "/admin/addAccountRegistration";
    }

    @PostMapping("/admin/usermanagement/customerdetails/addaccountregistration")
    public String addAccountRegister(@RequestParam("userId") Integer userId, @ModelAttribute UserRequestDto userRequestDto, Model model) {
        userRequestDto.setUserId(userId);
        UserRequestDto userResponseDto = iAccountService.addAccount(userRequestDto);
        model.addAttribute("account", userResponseDto);

        UserResponseDto userDto = iUserService.getUserByIdUser(userId);

        List<AccountResponseDto> accountResponseDtoList = iAccountService.getAllUserAccounts(userId);
        model.addAttribute("customerDetailsFromAccount", accountResponseDtoList);
        model.addAttribute("customerDetalis", userDto);
        return "admin/customeraccounts";
    }

}
