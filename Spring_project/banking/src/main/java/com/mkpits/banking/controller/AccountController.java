package com.mkpits.banking.controller;

import com.mkpits.banking.dto.request.AccountRequestDto;
import com.mkpits.banking.dto.request.MoneyTransactionRequestDto;
import com.mkpits.banking.dto.request.UserRequestDto;
import com.mkpits.banking.dto.response.*;
import com.mkpits.banking.service.IAccountService;
import com.mkpits.banking.service.IUserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
public class AccountController {
    @Autowired
    IAccountService iAccountService;

    @GetMapping(path = "/v1/accounts/users/{userId}")
    public ResponseEntity<Object> getAccounts(@PathVariable("userId") Integer userId) {
        AccountGetResponseDto accountGetResponseDto = iAccountService.getAccountByUserId(userId);
        return ResponseEntity.ok(accountGetResponseDto);
    }
    @GetMapping("/api/v1/accounts/users/{userId}")
    public ResponseEntity<AccountResponseDto> getAccountsByUserId(@PathVariable Integer userId) {
        List<AccountGetResponseDto> accountGetResponseDtoList = iAccountService.getAccountsByUserId(userId);
        AccountResponseDto response = new AccountResponseDto(accountGetResponseDtoList);
        return ResponseEntity.ok(response);
    }


    @PostMapping(path="/api/v1/accounts")
    public ResponseEntity<Object> createAccount(@Valid @RequestBody AccountRequestDto accountRequestDto) {
        AccountPostResponseDto accountPostResponseDto = iAccountService.createAccount(accountRequestDto);
        return ResponseEntity.created(URI.create("/api/v1/accounts/" + accountPostResponseDto.getUserId())).body(accountPostResponseDto);
    }
    @PutMapping(path = "/v1/accounts/users/{userId}") //for updating we use put
    public ResponseEntity<Object> updateAccounts(@PathVariable("userId") Integer userId, @RequestBody UserRequestDto userRequestDto){
        userRequestDto.setUserId(userId);
        AccountPutResponseDto accountPutResponseDto = iAccountService.updateAccount(userRequestDto);{
            if(accountPutResponseDto == null){
                return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
                } else{
                return  new ResponseEntity<>(accountPutResponseDto, HttpStatus.OK);
            }

        }
    }
    @PostMapping("/v1/accounts/users/{userId}")
    public ResponseEntity<String> transaction(@PathVariable Integer userId, @RequestBody MoneyTransactionRequestDto transactionRequest) {
        transactionRequest.setFromUserId(userId);
        iAccountService.transaction(transactionRequest);
        return new ResponseEntity<>("Transfer successful", HttpStatus.OK);
    }
}