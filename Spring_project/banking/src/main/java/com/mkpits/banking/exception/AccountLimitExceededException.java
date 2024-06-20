package com.mkpits.banking.exception;

public class AccountLimitExceededException extends  RuntimeException {
    public AccountLimitExceededException(String message) {
        super(message);
    }
}
