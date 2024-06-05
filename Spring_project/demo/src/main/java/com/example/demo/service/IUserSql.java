package com.example.demo.service;

import com.example.demo.dto.UserDtoSql;

import java.util.List;

public interface IUserSql {


    public UserDtoSql getUserById(Integer id);
    public List<UserDtoSql> getAllUsers();

    public UserDtoSql updateUser(UserDtoSql userDtoSql);


    public UserDtoSql createUser(UserDtoSql userDtoSql);
}
