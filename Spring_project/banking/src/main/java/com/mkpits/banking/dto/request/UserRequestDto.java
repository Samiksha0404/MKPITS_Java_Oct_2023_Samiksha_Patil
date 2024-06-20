package com.mkpits.banking.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserRequestDto {

    private Integer id;

    @NotNull(message = "First name is required")
    @Size(max = 30, message = "First name must be at most 30 characters")
    private String firstName;

    @Size(max = 30, message = "Middle name must be at most 30 characters")
    private String middleName;

    @NotNull(message = "Last name is required")
    @Size(max = 30, message = "Last name must be at most 30 characters")
    private String lastName;

    @NotNull(message = "Gender is required")
    @Pattern(regexp = "^[MF]$", message = "Gender must be 'M' or 'F'")
    private String gender;

    @NotNull(message = "Mobile number is required")
    @Pattern(regexp = "^[0-9]{10}$", message = "Mobile number must be 10 digits")
    private String mobile;

    @NotNull(message = "Email is required")
    @Email(message = "Email should be valid")
    @Size(max = 40, message = "Email must be at most 40 characters")
    private String email;

    private String address;

    @Size(max = 30, message = "City must be at most 30 characters")
    private String city;

    private LocalDate dob;

    // for accounts
    private Integer userId;

    @NotNull(message = "Account type is required")
    @Size(max = 10, message = "Account type must be at most 10 characters")
    private String accountType;

    @Pattern(regexp = "^\\d+(\\.\\d+)?$", message = "Rate of interest must be a valid number")
    private String rateOfInterest;

    @Pattern(regexp = "^\\d+(\\.\\d+)?$", message = "Balance must be a valid number")
    private String balance;
}

