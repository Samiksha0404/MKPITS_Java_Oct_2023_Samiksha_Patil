package com.mkpits.banking.dto.request;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AccountRequestDto {
    private Integer userId;
    private String accountType;
    private String rateOfInterest;
    private String balance;
}
