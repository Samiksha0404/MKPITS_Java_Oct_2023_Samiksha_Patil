
package com.example.demo.service.impl;

import com.example.demo.dto.UserDtoSql;
import com.example.demo.mysql.model.UserCredential;
import com.example.demo.mysql.model.UserModel;
import com.example.demo.repository.UserCredentialsRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.IUserSql;
import com.google.common.hash.Hashing;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserServiceSql implements IUserSql {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserCredentialsRepository userCredentialRepository;


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
    public UserDtoSql updatePatchUser(UserDtoSql userDtoSql) {
        Optional<UserModel> userModelOptional = userRepository.findById(userDtoSql.getId());
        if (userModelOptional.isEmpty()) {
            System.out.println("User data with id: " + userDtoSql.getId() + " not found");
        } else {
            UserModel userModel = userModelOptional.get();
            userModel.setFirstName(userDtoSql.getFirstName() != null && !userDtoSql.getFirstName().equals(userModel.getFirstName()) ? userDtoSql.getFirstName(): userModel.getFirstName());
            userModel.setLastName(userDtoSql.getLastName()!=null && !userDtoSql.getLastName().equals(userModel.getLastName()) ? userDtoSql.getLastName(): userModel.getLastName());
            userModel.setMobile(userDtoSql.getMobile()!=null && !userDtoSql.getMobile().equals(userModel.getMobile()) ? userDtoSql.getMobile(): userModel.getMobile());
            userModel.setEmail(userDtoSql.getEmail()!=null && !userDtoSql.getEmail().equals(userModel.getEmail()) ? userDtoSql.getEmail(): userModel.getEmail());
            userModel.setUpdatedBy(1);
            userModel.setUpdatedAt(LocalDateTime.now());
            userModel = userRepository.save(userModel);
            return convertUserModelToUserDtoSql(userModel);
        }
        return userDtoSql;
    }


    @Override
    @Transactional
    public UserDtoSql createUser(UserDtoSql userDtoSql) {
        UserModel userModel = new UserModel();
        userModel = convertUserDtoToUserModel(userDtoSql, userModel);
        userModel.setCreatedBy(1);
        userModel.setCreatedAt(LocalDateTime.now());
        userModel = userRepository.save(userModel);

        // Below code saves data in user_credentials table
        UserCredential userCredential = new UserCredential();
        String uuid = UUID.randomUUID().toString();
        System.out.println("UUID: " + uuid);
        final String computedPassword = Hashing.sha256()
                .hashString(userDtoSql.getPassword(), StandardCharsets.UTF_8).toString() + uuid;
        userCredential.setUserId(userModel.getId());
        userCredential.setUsername(userDtoSql.getUsername());
        userCredential.setPassword(computedPassword);
        userCredential.setPasswordSalt(uuid);
        userCredential.setLoginDateTime(LocalDateTime.now());
        userCredential.setCreatedBy(1);
        userCredential.setCreatedAt(LocalDateTime.now());
        userCredential.setUpdatedBy(1);
        userCredential.setUpdatedAt(LocalDateTime.now());
        userCredentialRepository.save(userCredential);
        return convertUserModelToUserDtoSql(userModel);
    }

    @Override
    public UserDtoSql deleteUserById(Integer id) {
        Optional<UserModel> userModelOptional = userRepository.findById(id);
        if (userModelOptional.isEmpty()) {
            System.out.println("User data with id: " + id + " not found");

        } else {
            userRepository.deleteById(id);
            System.out.println("User data with id: " + id + " deleted successfully");
        }
        return convertUserModelToUserDtoSql(userModelOptional.get());
    }

    private UserModel convertUserDtoToUserModel(UserDtoSql userDtoSql, UserModel userModel) {
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
        userDtoSql.setFirstName(userModel.getFirstName());
        userDtoSql.setLastName(userModel.getLastName());
        userDtoSql.setMobile(userModel.getMobile());
        userDtoSql.setEmail(userModel.getEmail());
        return  userDtoSql;
    }
}