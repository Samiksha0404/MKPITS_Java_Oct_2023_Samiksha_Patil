package com.mkpits.banking.dto.response;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserPostResponseDto {
    private Integer id;
    private String firstName;
    private String lastName;
}
