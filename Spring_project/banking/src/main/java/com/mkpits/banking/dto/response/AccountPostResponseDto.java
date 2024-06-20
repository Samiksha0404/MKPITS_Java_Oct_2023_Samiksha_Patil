package com.mkpits.banking.dto.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AccountPostResponseDto {
    private Integer userId;
    private String accountType;
    private String rateOfInterest;
    private String balance;
}
