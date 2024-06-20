package com.mkpits.banking.service;

import com.mkpits.banking.dto.request.AccountRequestDto;
import com.mkpits.banking.dto.request.MoneyTransactionRequestDto;
import com.mkpits.banking.dto.request.UserRequestDto;
import com.mkpits.banking.dto.response.AccountGetResponseDto;
import com.mkpits.banking.dto.response.AccountPostResponseDto;
import com.mkpits.banking.dto.response.AccountPutResponseDto;
import com.mkpits.banking.dto.response.UserGetResponseDto;

import java.util.List;

public interface IAccountService {
    public AccountGetResponseDto getAccountByUserId(Integer  userId);
    public AccountPutResponseDto updateAccount(UserRequestDto userRequestDto);
    public void transaction(MoneyTransactionRequestDto transactionRequest) ;
    public AccountPostResponseDto createAccount(AccountRequestDto accountRequestDto);
    public List<AccountGetResponseDto> getAccountsByUserId(Integer userId);


}
