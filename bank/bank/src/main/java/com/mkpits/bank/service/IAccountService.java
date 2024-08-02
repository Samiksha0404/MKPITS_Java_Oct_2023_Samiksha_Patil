package com.mkpits.bank.service;

import com.mkpits.bank.dto.MoneyTransferRequestDto;
import com.mkpits.bank.dto.UserRequestDto;
import com.mkpits.bank.dto.response.AccountResponseDto;
import com.mkpits.bank.dto.response.MoneyTransferResponseDto;

import java.util.List;

public interface IAccountService {
    public List<AccountResponseDto> getAllUserAccounts(Integer userId);


    AccountResponseDto deleteAccount(String accNo);

    Integer getUserIdByAccountNo(String accNo);

    UserRequestDto addAccount(UserRequestDto userRequestDto);

    MoneyTransferResponseDto amountTransfer(MoneyTransferRequestDto transferRequest, Integer senderUserId);
}