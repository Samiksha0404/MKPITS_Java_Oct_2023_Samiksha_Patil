package com.mkpits.bank.dto.response;


import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseDto {
    private Integer id;

    private String firstName;

    private String middleName;

    private String lastName;

    private String gender;

    private String mobile;

    private String email;

    private String dob;

    private String cin;

    private String aadharNo;
    private String address;

    private String pincode;
    private String userName;
    private String accountType;

    private String branchName;
    private String BranchCode;
    private String ifsc;
}
