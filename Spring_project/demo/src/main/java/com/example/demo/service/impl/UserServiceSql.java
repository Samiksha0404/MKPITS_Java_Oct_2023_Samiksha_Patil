
package com.example.demo.service.impl;

import com.example.demo.dto.UserDtoSql;
import com.example.demo.mysql.model.UserModel;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.IUserSql;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceSql implements IUserSql {

    @Autowired
    UserRepository userRepository;



    @Override
    public UserDtoSql getUserById(Integer id) {
        Optional<UserModel> userModel = userRepository.findById(id);
        UserDtoSql userDtoSql = new UserDtoSql();
        if (userModel.isPresent()) {
            userDtoSql = convertUserModelToUserDtoSql(userModel.get());
        }
        return userDtoSql;
    }

    @Override
    public List<UserDtoSql> getAllUsers() {

        List<UserModel> userModelList = (List<UserModel>) userRepository.findAll();
        List<UserDtoSql> userDtoSqlList = new ArrayList<>();
        for (UserModel userModel : userModelList) {
            UserDtoSql userDtoSql = convertUserModelToUserDtoSql(userModel);
            userDtoSqlList.add(userDtoSql);
        }
        return userDtoSqlList;
    }


    @Override
    public UserDtoSql updateUser(UserDtoSql userDtoSql) {
        Optional<UserModel> userModelOptional = userRepository.findById(userDtoSql.getId());
        if(userModelOptional.isEmpty()) {
            System.out.println("User data with id: " + userDtoSql.getId() + " not found");
        } else {
            UserModel userModel = convertUserDtoToUserModel(userDtoSql, userModelOptional.get());
            userModel.setId(userDtoSql.getId());
            userModel = userRepository.save(userModel);
            return convertUserModelToUserDtoSql(userModel);
        }
        return userDtoSql;
    }


    @Override
    public UserDtoSql createUser(UserDtoSql userDtoSql) {
        UserModel userModel = new UserModel();
        userModel = convertUserDtoToUserModel(userDtoSql, userModel);
        userModel.setCreatedBy(1);
        userModel.setCreatedAt(LocalDateTime.now());
        userModel = userRepository.save(userModel);
        return convertUserModelToUserDtoSql(userModel);
    }

    private UserModel convertUserDtoToUserModel(UserDtoSql userDtoSql, UserModel userModel) {
        userModel.setUsername(userDtoSql.getUsername());
        userModel.setFirstName(userDtoSql.getFirstName());
        userModel.setLastName(userDtoSql.getLastName());
        userModel.setMobile(userDtoSql.getMobile());
        userModel.setEmail(userDtoSql.getEmail());
        userModel.setUpdatedBy(1);
        userModel.setUpdatedAt(LocalDateTime.now());
        return userModel;
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