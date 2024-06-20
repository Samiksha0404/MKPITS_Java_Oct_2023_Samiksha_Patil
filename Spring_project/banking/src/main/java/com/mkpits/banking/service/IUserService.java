package com.mkpits.banking.service;

import com.mkpits.banking.dto.request.UserRequestDto;
import com.mkpits.banking.dto.response.UserGetResponseDto;
import com.mkpits.banking.dto.response.UserPostResponseDto;

import java.util.List;

public interface IUserService {

    public UserGetResponseDto getUserById(Integer id);

    public List<UserGetResponseDto> getAllUsers();

    public UserPostResponseDto createUser(UserRequestDto userRequestDto);

    public UserRequestDto updateUser(UserRequestDto userRequestDto);

    public UserRequestDto deleteUserById(Integer id);


}
