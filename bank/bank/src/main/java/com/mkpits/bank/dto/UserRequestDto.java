package com.mkpits.bank.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRequestDto {
    private Integer id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String mobile;
    private String email;
    private String gender;
    private String dateOfBirth;
    private String cin;
    private String aadharNo;
    private String address;
    private String pincode;
    private String userName;
    private String accountType;
    private String password;
    private String passwordSalt;
    private String city;
    private String district;
    private String state;
    private double balance;
    private Integer userId;
}
