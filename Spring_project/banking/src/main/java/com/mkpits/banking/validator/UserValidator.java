package com.mkpits.banking.validator;

import com.mkpits.banking.dto.request.UserRequestDto;
import org.springframework.stereotype.Component;

@Component
public class UserValidator {

    public void validateAndSetAccountType(UserRequestDto userRequestDto) {
        String accountType = userRequestDto.getAccountType();
        if (accountType == null || (!accountType.equalsIgnoreCase("savings") && !accountType.equalsIgnoreCase("current"))) {
            throw new RuntimeException("'accountType' must be 'savings' or 'current'");
        }
        userRequestDto.setAccountType(accountType.toLowerCase());
    }
}