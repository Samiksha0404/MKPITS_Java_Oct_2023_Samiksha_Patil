package com.mkpits.bank.dto;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class TransactionRequestDto {


    private String fromAccount;

    private String toAccount;

    private BigDecimal amount;
}
