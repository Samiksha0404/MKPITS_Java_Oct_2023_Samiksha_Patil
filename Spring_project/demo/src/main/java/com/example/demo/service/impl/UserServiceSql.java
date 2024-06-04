
package com.example.demo.service.impl;

import com.example.demo.dto.UserDtoSql;
import com.example.demo.mysql.model.UserModel;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.IUserSql;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceSql implements IUserSql {

    @Autowired
    UserRepository userRepository;




    @Override
    public UserDtoSql getUserDetail() {
        Optional<UserModel> userModel = userRepository.findById(1);
        UserDtoSql userDtoSql = new UserDtoSql();
        if (userModel.isPresent()) {
            userDtoSql = convertUserModelToUserDtoSql(userModel.get());

        }
        return userDtoSql;
    }

    private UserDtoSql convertUserModelToUserDtoSql(UserModel userModel) {
        UserDtoSql userDtoSql = new UserDtoSql();

        userDtoSql.setId(userModel.getId());
        userDtoSql.setUsername(userModel.getUsername());
        userDtoSql.setFirstName(userModel.getFirstName());
        userDtoSql.setLastName(userModel.getLastName());
        userDtoSql.setMobile(userModel.getMobile());
        userDtoSql.setEmail(userModel.getEmail());
        return  userDtoSql;
    }
}