package com.mkpits.banking.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class AccountResponseDto {
    private List<AccountGetResponseDto> accounts;

}