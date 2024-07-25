package com.mkpits.bank.controller;

import com.mkpits.bank.dto.EmployeeRequestDto;
import com.mkpits.bank.dto.response.AccountResponseDto;
import com.mkpits.bank.dto.UserRequestDto;
import com.mkpits.bank.dto.response.UserResponseDto;
import com.mkpits.bank.service.IAccountService;
import com.mkpits.bank.service.IEmployeeService;
import com.mkpits.bank.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller

public class EmployeeController {

    @Autowired
    IUserService iUserService;

    @Autowired
    IAccountService iAccountService;

    @Autowired
    IEmployeeService iEmployeeService;

    @GetMapping("/employee/dashboard")
    public  String employeeDashboard(){
        return "/employee/index";
    }

    @GetMapping("/employee/dashboard/usermanagement")
    public  String adminUserManagement(Model model) {
        List<UserResponseDto> userResonseDtoList = iUserService.getAllUsers();
        model.addAttribute("userManagement", userResonseDtoList);
        return "employee/userManagement";
    }

    @PostMapping("/employee/dashboard/employeemanagement/register")
        public String registerUser(@ModelAttribute UserRequestDto userRequestDto, Model model ) {
        UserResponseDto userResponseDto = iUserService.createUser(userRequestDto);
        model.addAttribute("user", userResponseDto);

        List<UserResponseDto> userResponseDtoList =  iUserService.getAllUsers();
        model.addAttribute("userManagement", userResponseDto);
        return  "employee/userManagement"; // The view name of success page
    }
 @GetMapping("employee/dashboard/customerdetails/{userId}")
    public String adminCustomerAccounts(@PathVariable("userId") Integer userId,Model model){
        UserResponseDto userResponseDto = iUserService.getUserByIdUser(userId);
        List<AccountResponseDto> accountResponseDtos = iAccountService.getAllUserAccounts(userId);
        model.addAttribute("customerDetails", userResponseDto);
        model.addAttribute("customerDetailsFromAccount", accountResponseDtos);
        return "employee/customeraccounts";
    }


    @GetMapping("/employee/dashboard/employeemanagement/registrationform")
    public String showRegistrationForm(Model model) {
        model.addAttribute("userRequestDto", new UserRequestDto());
        return "employee/registration";
    }

}
