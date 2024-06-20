package com.example.demo.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
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
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserRequestDto {


    private Integer id;

    @NotNull(message = "'username' cannot be null")
    @Size(min = 6, max = 45, message = "'username' can be minimum 6 character and maximum 45 characters")
    private String username;

    @NotNull(message = "'firstName' cannot be null")
    @Pattern(regexp = "[a-zA-Z]+", message = "'firstName' can only contain alphabets")
    @Size(min = 1, max = 30)    private String firstName;

    @NotNull(message = "'lastName' cannot be null")
    @Size(min = 1, max = 30)
    @Pattern(regexp = "[a-zA-Z]+", message = "'lastName' can only contain alphabets")
    private String lastName;

    @NotNull(message = "'dob' cannot be null and must follow yyyy-mm-dd format")
    private LocalDate dob;

    @NotNull(message = "'password' cannot be null")
    @Size(min = 8, max = 30)
    private String password;


    @NotNull(message = "'mobile' number cannot be null")
    @Size(min = 10, message = "'mobile' must contain 10 digits")
    @Pattern(regexp = "^[0-9]+$", message = "mobile No. Must be a number")
    private String mobile;

    @NotNull(message = "'email' cannot be null and must follow xyz3@gmail.com format")
    @Pattern(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}", message = "'email' contain Ex:- xyz3@gmail.com")
    private String email;
}