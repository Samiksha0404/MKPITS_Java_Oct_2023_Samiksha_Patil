package com.mkpits.bank.service;

import com.mkpits.bank.dto.UserRequestDto;
import com.mkpits.bank.dto.response.AccountResponseDto;

import java.util.List;

public interface IAccountService {
    public List<AccountResponseDto> getAllUserAccounts(Integer userId);


    AccountResponseDto deleteAccount(String accNo);

    Integer getUserIdByAccountNo(String accNo);

    UserRequestDto addAccount(UserRequestDto userRequestDto);

}