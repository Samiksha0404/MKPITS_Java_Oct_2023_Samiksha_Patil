package com.mkpits.bank.service;

import com.mkpits.bank.dto.UserRequestDto;
import com.mkpits.bank.dto.response.UserResponseDto;

import java.util.List;

public interface IUserService {
// public  List<UserRequestDto> getAllUsers();

   public  List<UserResponseDto> getAllUsers();

    UserResponseDto getUserByIdUser(Integer id);


   public UserResponseDto createUser(UserRequestDto userRequestDto);

    UserResponseDto updateUser(UserRequestDto userRequestDto);

    UserResponseDto getdetailsBybranchid(Integer userId);
}
