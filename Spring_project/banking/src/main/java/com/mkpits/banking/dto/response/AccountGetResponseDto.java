package com.mkpits.banking.dto.response;

import jakarta.persistence.Column;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AccountGetResponseDto {

    private Integer userId;
    private String accountType;
    private String rateOfInterest;
    private String balance;



}
