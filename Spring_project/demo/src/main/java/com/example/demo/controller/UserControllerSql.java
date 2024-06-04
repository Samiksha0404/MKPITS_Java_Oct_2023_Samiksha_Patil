package com.example.demo.controller;

import com.example.demo.dto.UserDtoSql;
import com.example.demo.service.impl.UserServiceSql;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserControllerSql {

    @Autowired
    UserServiceSql userServiceSql;

    @RequestMapping("/v1/users")
    public ResponseEntity<Object> getUsers() {
        UserDtoSql userDtoSql = userServiceSql.getUserDetail();
        System.out.println("Service Constructor: " + userServiceSql.hashCode());
        return ResponseEntity.ok(userDtoSql);

    }
}
