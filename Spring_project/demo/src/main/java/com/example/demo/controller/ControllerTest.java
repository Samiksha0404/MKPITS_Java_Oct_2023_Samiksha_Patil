package com.example.demo.controller;

import com.example.demo.dto.UserDto;
import com.example.demo.service.impl.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {


    UserService userServiceConstrutor = new UserService();

    UserService userServiceSetter = new UserService();

    public ControllerTest( UserService userServiceConstructor){
        this.userServiceConstrutor =userServiceConstructor;
    }

    public void  setUserServiceSetter(UserService userService){
        this.userServiceSetter =userService;
    }

    @RequestMapping("/constructor")
    public ResponseEntity<Object> getUserConstructor(){

        UserDto userDto1 = userServiceConstrutor.getAllUsers();
        System.out.println("Service Constructor : " + userServiceConstrutor.hashCode());
        return ResponseEntity.ok(userDto1);
    }

    @RequestMapping("/setter")
    public ResponseEntity<Object> getUserSetter(){

        UserDto userDto2 = userServiceSetter.getAllUsers();
        System.out.println("Service Setter : " + userServiceSetter.hashCode());


        return ResponseEntity.ok(userDto2);
    }

}
