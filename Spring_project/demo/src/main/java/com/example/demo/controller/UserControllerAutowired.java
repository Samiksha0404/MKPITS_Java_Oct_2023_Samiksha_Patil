package com.example.demo.controller;

import com.example.demo.dto.UserDto;
import com.example.demo.service.IUserService;
import com.example.demo.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserControllerAutowired {

    @Autowired
    IUserService userService;


    @RequestMapping("/autowire")
    public ResponseEntity<Object>getUserAutowired(){
        System.out.println("Service Autowired: "+ userService.hashCode());
        UserDto userDtoAutowire = userService.getAllUsers();
        return ResponseEntity.ok(userDtoAutowire);
    }




}
