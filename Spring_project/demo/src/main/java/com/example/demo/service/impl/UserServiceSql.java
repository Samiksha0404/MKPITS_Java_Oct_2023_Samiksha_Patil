
package com.example.demo.service.impl;

import com.example.demo.dto.request.UserRequestDto;
import com.example.demo.dto.response.UserGetResponseDto;
import com.example.demo.dto.response.UserPostResponseDto;


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
    public UserGetResponseDto getUserById(Integer id) {
        Optional<UserModel> userModel = userRepository.findById(id);
        UserGetResponseDto userRequestDto = new UserGetResponseDto();
        if (userModel.isPresent()) {
            userRequestDto = convertUserModelToUserGetResponseDtoSql(userModel.get());
        }
        return userRequestDto;
    }

    @Override
    public List<UserGetResponseDto> getAllUsers() {

        List<UserModel> userModelList = (List<UserModel>) userRepository.findAll();
        List<UserGetResponseDto> userGetResponseDtoList = new ArrayList<>();
        for (UserModel userModel : userModelList) {
            UserGetResponseDto userGetResponseDto = convertUserModelToUserGetResponseDto(userModel);
            userGetResponseDtoList.add( userGetResponseDto);
        }
        return userGetResponseDtoList;    }


    @Override
    public UserRequestDto updateUser(UserRequestDto userDtoSql) {
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

    private UserGetResponseDto convertUserModelToUserGetResponseDto(UserModel user) {
        UserGetResponseDto userGetResponseDto = new UserGetResponseDto();
        userGetResponseDto.setId(user.getId());
        userGetResponseDto.setFirstName(user.getFirstName());
        userGetResponseDto.setLastName(user.getLastName());
        userGetResponseDto.setMobile(user.getMobile());
        userGetResponseDto.setEmail(user.getEmail());
        return userGetResponseDto;
    }

    @Override
    public UserRequestDto updatePatchUser(UserRequestDto userDtoSql) {
        Optional<UserModel> userModelOptional = userRepository.findById(userDtoSql.getId());
        if (userModelOptional.isEmpty()) {
            System.out.println("User data with id: " + userDtoSql.getId() + " not found");
        } else {
            UserModel userModel = userModelOptional.get();
            userModel.setFirstName(userDtoSql.getFirstName() != null && !userDtoSql.getFirstName().equals(userModel.getFirstName()) ? userDtoSql.getFirstName(): userModel.getFirstName());
            userModel.setLastName(userDtoSql.getLastName()!=null && !userDtoSql.getLastName().equals(userModel.getLastName()) ? userDtoSql.getLastName(): userModel.getLastName());
            userModel.setMobile(userDtoSql.getMobile()!=null && !userDtoSql.getMobile().equals(userModel.getMobile()) ? userDtoSql.getMobile(): userModel.getMobile());
            userModel.setEmail(userDtoSql.getEmail()!=null && !userDtoSql.getEmail().equals(userModel.getEmail()) ? userDtoSql.getEmail(): userModel.getEmail());
            userModel.setDob(userDtoSql.getDob()!=null && !userDtoSql.getDob().equals(userModel.getDob()) ? userDtoSql.getDob(): userModel.getDob());
            userModel.setUpdatedBy(1);
            userModel.setUpdatedAt(LocalDateTime.now());
            userModel = userRepository.save(userModel);
            return convertUserModelToUserDtoSql(userModel);
        }
        return userDtoSql;
    }


    @Override
    @Transactional
    public UserPostResponseDto createUser(UserRequestDto userDtoSql) {
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

        //return convertUserModelToUserDtoSql(userModel);

        UserPostResponseDto userPostResponseDto = new UserPostResponseDto();
        userPostResponseDto.setId(userModel.getId());
        userPostResponseDto.setUsername(userCredential.getUsername());
        userPostResponseDto.setFirstName(userModel.getFirstName());
        userPostResponseDto.setLastName(userModel.getLastName());

          return userPostResponseDto;

    }

    @Override
    public UserRequestDto deleteUserById(Integer id) {
        Optional<UserModel> userModelOptional = userRepository.findById(id);
        if (userModelOptional.isEmpty()) {
            System.out.println("User data with id: " + id + " not found");

        } else {
            userRepository.deleteById(id);
            System.out.println("User data with id: " + id + " deleted successfully");
        }
        return convertUserModelToUserDtoSql(userModelOptional.get());
    }



    private UserModel convertUserDtoToUserModel(UserRequestDto userRequestDto, UserModel userModel) {
//        userModel.setFirstName(userDtoSql.getFirstName());
//        userModel.setLastName(userDtoSql.getLastName());
//        userModel.setMobile(userDtoSql.getMobile());
//        userModel.setEmail(userDtoSql.getEmail());
//        userModel.setUpdatedBy(1);
//        userModel.setUpdatedAt(LocalDateTime.now());

        userModel = UserModel.builder()
                .firstName(userRequestDto.getFirstName())
                .lastName(userRequestDto.getLastName())
                .mobile(userRequestDto.getMobile())
                .email(userRequestDto.getEmail())
                .dob(userRequestDto.getDob())
                .updatedAt(LocalDateTime.now())
                .updatedBy(1)
                .build();
        return userModel;
    }

    private UserGetResponseDto convertUserModelToUserGetResponseDtoSql(UserModel userModel) {

        UserGetResponseDto userRequestDto= new UserGetResponseDto();
//       userRequestDto  = UserRequestDto.builder()
//                        .id(userModel.getId())
//                                .firstName(userModel.getFirstName())
//                .lastName(userModel.getLastName())
//                .mobile(userModel.getMobile())
//                .email(userModel.getEmail())
//                .dob(userModel.getDob())
//                .build();
        userRequestDto.setId(userModel.getId());
        userRequestDto.setFirstName(userModel.getFirstName());
        userRequestDto.setLastName(userModel.getLastName());
        userRequestDto.setMobile(userModel.getMobile());
        userRequestDto.setEmail(userModel.getEmail());

        return  userRequestDto;
    }


    private UserRequestDto convertUserModelToUserDtoSql(UserModel userModel) {

        UserRequestDto userRequestDto = new UserRequestDto();
        userRequestDto.setId(userModel.getId());
        userRequestDto.setFirstName(userModel.getFirstName());
        userRequestDto.setLastName(userModel.getLastName());
        userRequestDto.setMobile(userModel.getMobile());
        userRequestDto.setEmail(userModel.getEmail());

        return  userRequestDto;
    }
}