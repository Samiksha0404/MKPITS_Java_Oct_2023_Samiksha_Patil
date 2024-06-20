package com.mkpits.banking.controller;

import com.mkpits.banking.dto.request.UserRequestDto;
import com.mkpits.banking.dto.response.UserGetResponseDto;
import com.mkpits.banking.dto.response.UserPostResponseDto;
import com.mkpits.banking.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
public class UserController{

    @Autowired
    IUserService iUserService;

    @GetMapping(path = "/v1/users/{id}")
    public ResponseEntity<Object> getUser(@PathVariable("id") Integer id) {
        UserGetResponseDto userGetResponseDto = iUserService.getUserById(id);
        return ResponseEntity.ok(userGetResponseDto);

    }

    @GetMapping(path = "/v1/users", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getAllUsers(){
        List<UserGetResponseDto> userGetResponseDtoList = iUserService.getAllUsers();
        return  ResponseEntity.ok(userGetResponseDtoList);
    }

    @PostMapping(path = "/v1/users")
    public ResponseEntity<Object> createUser(@RequestBody UserRequestDto userRequestDto) {
        UserPostResponseDto userResponseDto = iUserService.createUser(userRequestDto);
        return ResponseEntity.created(URI.create("/v1/users" + userResponseDto.getId())).body(userResponseDto);
    }

    @PutMapping(path = "/v1/users/{id}")
    public  ResponseEntity<Object> updateUser(@PathVariable("id") Integer id, @RequestBody UserRequestDto userRequestDto){
      userRequestDto.setId(id);
      UserRequestDto userDtoReturn = iUserService.updateUser(userRequestDto);
      return  ResponseEntity.ok(userDtoReturn);
    }
 @DeleteMapping(path = "/v1/users/{id}")
public ResponseEntity<String> deleteUsers(@PathVariable("id") Integer id){
     UserRequestDto userRequestDto = iUserService.deleteUserById(id);
     if(userRequestDto != null){
         return new ResponseEntity<>("User with ID " + id + " deleted successfully", HttpStatus.OK);
     }else {
         return new ResponseEntity<>("User with ID " + id + " not found", HttpStatus.NOT_FOUND);
     }
 }
}
