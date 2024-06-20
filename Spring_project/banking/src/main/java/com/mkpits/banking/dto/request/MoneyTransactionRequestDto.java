package com.mkpits.banking.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MoneyTransactionRequestDto {
    private Integer fromUserId;
    private Integer toUserId;
    private BigDecimal amount;
}
