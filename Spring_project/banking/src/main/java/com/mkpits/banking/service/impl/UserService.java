package com.mkpits.banking.service.impl;

import com.mkpits.banking.dto.request.UserRequestDto;
import com.mkpits.banking.dto.response.UserGetResponseDto;
import com.mkpits.banking.dto.response.UserPostResponseDto;
import com.mkpits.banking.entity.Account;
import com.mkpits.banking.entity.User;
import com.mkpits.banking.repository.AccountRepository;
import com.mkpits.banking.repository.UserRepository;
import com.mkpits.banking.service.IUserService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    AccountRepository  accountRepository;

    @Override
    public UserGetResponseDto getUserById(Integer id) {

//optional ek container h
        Optional<User> user = userRepository.findById(id);
        UserGetResponseDto userResponseDto = new UserGetResponseDto();
        if (user.isPresent()) {
            userResponseDto = convertUserToUserGetResponseDto(user.get());
        }
        return userResponseDto;
    }


    @Override
    public List<UserGetResponseDto> getAllUsers() {
        List<User> userList  = (List<User>)  userRepository.findAll();
        List<UserGetResponseDto> userGetResponseDtoList = new ArrayList<>();
        for (User user :  userList){
            UserGetResponseDto  userGetResponseDto = convertUserToUserGetResponseDto(user);
            userGetResponseDtoList.add(userGetResponseDto);
        }

        return userGetResponseDtoList;
    }

    @Override
    @Transactional
    public UserPostResponseDto createUser(UserRequestDto userRequestDto) {
        User user = new User();
        user = convertUserRequestDtoToUser(userRequestDto, user);
        user.setCreatedBy(1);
        user.setCreatedAt(LocalDateTime.now());
        user = userRepository.save(user);


        //below code saves data in accounts table

        Account account  = new Account();
        account.setUserId(user.getId());
        account.setAccountType(userRequestDto.getAccountType());
        account.setRateOfInterest(userRequestDto.getRateOfInterest());
        account.setBalance(userRequestDto.getBalance());
        account.setCreatedBy(1);
        account.setCreatedAt(LocalDateTime.now());
        account.setUpdatedBy(1);
        account.setUpdatedAt(LocalDateTime.now());
        accountRepository.save(account);


        UserPostResponseDto  userPostResponseDto = new UserPostResponseDto();
        userPostResponseDto.setId(user.getId());
        userPostResponseDto.setFirstName(user.getFirstName());
        userPostResponseDto.setLastName(user.getLastName());



        return userPostResponseDto;
    }

    @Override
    public UserRequestDto updateUser(UserRequestDto userRequestDto) {
        Optional<User> userOptional = userRepository.findById(userRequestDto.getId());
        if(userOptional.isEmpty()) {
            System.out.println("User data with id: " + userRequestDto.getId() + " not found");
        } else {
            User user = convertUserRequestDtoToUser(userRequestDto, userOptional.get());
            user.setId(userRequestDto.getId());
            user = userRepository.save(user);
            return convertUserToUserRequestDto(user);
        }
        return userRequestDto;
    }

    @Override
    public UserRequestDto deleteUserById(Integer id) {
        Optional<User> userOptional = userRepository.findById(id);
        if(userOptional.isEmpty()){
            System.out.println("User data with id: " + id + " not found");

        }else{
            userRepository.deleteById(id);
            System.out.println("User data with id: " + id + " deleted successfully");

        }
        return convertUserToUserRequestDto(userOptional.get());
    }



    private UserRequestDto convertUserToUserRequestDto(User user) {
        UserRequestDto userRequestDto = new UserRequestDto();
        userRequestDto.setId(user.getId());
        userRequestDto.setFirstName(user.getFirstName());
        userRequestDto.setMiddleName(user.getMiddleName());
        userRequestDto.setLastName(user.getLastName());
        userRequestDto.setMobile(user.getMobile());
        userRequestDto.setEmail(user.getEmail());
        userRequestDto.setGender(user.getGender());
        userRequestDto.setAddress(user.getAddress());
        userRequestDto.setCity(user.getCity());
        userRequestDto.setDob(user.getDob());

        return  userRequestDto;
    }




    private User convertUserRequestDtoToUser(UserRequestDto userRequestDto, User user) {

        user = User.builder()
                .firstName(userRequestDto.getFirstName())
                .lastName(userRequestDto.getLastName())
                .middleName(userRequestDto.getMiddleName())
                .mobile(userRequestDto.getMobile())
                .email(userRequestDto.getEmail())
                .gender(userRequestDto.getGender())
                .city(userRequestDto.getCity())
                .dob(userRequestDto.getDob())
                .address(userRequestDto.getAddress())
                .updatedAt(LocalDateTime.now())
                .updatedBy(1)
                .build();
        return user;
    }

    private UserGetResponseDto convertUserToUserGetResponseDto(User user) {
        UserGetResponseDto userResponseDto= new UserGetResponseDto();
        userResponseDto.setId(user.getId());
        userResponseDto.setFirstName(user.getFirstName());
        userResponseDto.setMiddleName(user.getMiddleName());
        userResponseDto.setLastName(user.getLastName());
        userResponseDto.setMobile(user.getMobile());
        userResponseDto.setEmail(user.getEmail());
        userResponseDto.setGender(user.getGender());
        userResponseDto.setAddress(user.getAddress());
        userResponseDto.setCity(user.getCity());
        userResponseDto.setDob(user.getDob());



        return userResponseDto;
    }


}
