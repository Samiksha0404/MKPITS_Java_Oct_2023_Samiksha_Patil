package com.example.demo.service;

import com.example.demo.dto.request.UserRequestDto;
import com.example.demo.dto.response.UserGetResponseDto;
import com.example.demo.dto.response.UserPostResponseDto;
//import com.example.demo.dto.response.UserResponseDto;

import java.util.List;

public interface IUserSql {


    public UserGetResponseDto getUserById(Integer id);
    public List<UserGetResponseDto> getAllUsers();

    public UserRequestDto updateUser(UserRequestDto userDtoSql);

    public UserRequestDto updatePatchUser(UserRequestDto userDtoSql);

    public UserPostResponseDto createUser(UserRequestDto userDtoSql);

    public UserRequestDto deleteUserById(Integer id);
}
