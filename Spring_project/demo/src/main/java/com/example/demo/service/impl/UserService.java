package com.example.demo.service.impl;

import com.example.demo.dto.UserDto;
import com.example.demo.service.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Override
    public UserDto getAllUsers(){
       UserDto userDto = new UserDto();
       userDto.setId(101l);
       userDto.setUserName("Harsh");
       userDto.setAge(22);
       return userDto;

    }


}
