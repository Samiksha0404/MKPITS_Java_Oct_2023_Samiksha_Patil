package com.mkpits.bank.controller;

import com.mkpits.bank.dto.MoneyTransferRequestDto;
import com.mkpits.bank.dto.TransactionRequestDto;
import com.mkpits.bank.dto.response.AccountResponseDto;

import com.mkpits.bank.dto.response.MoneyTransferResponseDto;
import com.mkpits.bank.dto.response.UserResponseDto;
import com.mkpits.bank.service.IAccountService;
import com.mkpits.bank.service.IUserService;
import com.mkpits.bank.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class UserController {

    @Autowired
    IUserService iUserService;

    @Autowired
    IAccountService iAccountService;

    @GetMapping("/user/dashboard")
    public String userDashboard() {
        return "/useraccess/dashboard";
    }

    @GetMapping("/user/passbook")
    public String userPassbook(Model model) {
        Integer userId=30;
        UserResponseDto userDto = iUserService.getUserByIdUser(userId);
        model.addAttribute("customerDetalis", userDto);

        UserResponseDto userResponseDto= iUserService.getdetailsBybranchid(userId);
        model.addAttribute("userResponseDto", userResponseDto);
        return "/useraccess/passbook";
    }



    @GetMapping("/user/transfermoney")
    public String userTransfermoney() {
        return "/useraccess/transfermoney";
    }

    @GetMapping("/user/accounts")
    public String adminAccounts( Model model ) {
//    @RequestParam("userId") Integer userId,
        Integer userId=30;
        UserResponseDto userDto = iUserService.getUserByIdUser(userId);
        List<AccountResponseDto> accountResponseDto = iAccountService.getAllUserAccounts(userId);
        model.addAttribute("customerDetalis", userDto);
        model.addAttribute("customerDetailsFromAccount", accountResponseDto);

        return "/useraccess/accounts";
    }


    @GetMapping("/user/transfer")
    public String getTransferForm(Model model) {
        model.addAttribute("transferRequest", new MoneyTransferRequestDto());
        return "useraccess/transfermoney";
    }

    @PostMapping("/user/transfer")
    public String transferAmount(@ModelAttribute MoneyTransferRequestDto transferRequest, Model model) {
        try {
            Integer senderUserId=30;

            MoneyTransferResponseDto response = iAccountService.amountTransfer(transferRequest, senderUserId);
            model.addAttribute("message", "Transfer successful!");
            model.addAttribute("transactions", response.getTransactions());
            return "useraccess/transactionstatus";


        } catch (Exception e) {
            model.addAttribute("message", "Transfer failed: " + e.getMessage());
            return "useraccess/transactionstatus";

        }

    }

}