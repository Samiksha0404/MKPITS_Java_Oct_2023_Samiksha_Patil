package com.mkpits.banking.config;

import com.mkpits.banking.exception.AccountLimitExceededException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
//
public class CustomExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> handleRuntimeException(RuntimeException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(AccountLimitExceededException.class)
    public  ResponseEntity<String>handleAccountLimitExceededException(AccountLimitExceededException ex){
        return  new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }
}