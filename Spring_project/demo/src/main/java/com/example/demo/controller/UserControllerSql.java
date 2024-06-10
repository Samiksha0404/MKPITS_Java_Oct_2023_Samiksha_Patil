package com.example.demo.controller;

import com.example.demo.dto.UserDtoSql;
import com.example.demo.service.IUserSql;
import com.example.demo.service.impl.UserServiceSql;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserControllerSql {

    @Autowired

    IUserSql iUserSql;

    @RequestMapping(value = "/v1/users/{id}", method = RequestMethod.GET)
    public ResponseEntity<Object> getUser(@PathVariable("id") Integer id) {
        UserDtoSql userDtoSql = iUserSql.getUserById(id);
       // System.out.println("Service Constructor: " + iUserSql.hashCode());
        return ResponseEntity.ok(userDtoSql);

    }

    @RequestMapping(value = "/v1/users/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Object> updateUser(@PathVariable("id") Integer id, @RequestBody UserDtoSql userDtoSql) {
        userDtoSql.setId(id);

        UserDtoSql userDtoReturn = iUserSql.updateUser(userDtoSql);
        return ResponseEntity.ok(userDtoSql);
    }
    @RequestMapping(value = "/v1/users", method = RequestMethod.GET)
    public ResponseEntity<Object> getAllUsers() {
        List<UserDtoSql> userDtoList = iUserSql.getAllUsers();
        return ResponseEntity.ok(userDtoList);

    }
    @RequestMapping(value = "/v1/users/{id}", method = RequestMethod.PATCH)
    public ResponseEntity<Object> updatePatchUser(@PathVariable("id") Integer id, @RequestBody UserDtoSql userDtoSql) {
        userDtoSql.setId(id);
        UserDtoSql userDtoReturn = iUserSql.updatePatchUser(userDtoSql);
        return ResponseEntity.ok(userDtoSql);
    }

    @RequestMapping(value = "/v1/users", method = RequestMethod.POST)
    public ResponseEntity<Object> createUser(@RequestBody UserDtoSql userDtoSql) {
        UserDtoSql userDtoReturn = iUserSql.createUser(userDtoSql);
        return ResponseEntity.ok(userDtoReturn);
    }

    @RequestMapping(value = "/v1/users/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<String> deleteUser(@PathVariable("id") Integer id) {
        UserDtoSql userDtoSql = iUserSql.deleteUserById(id);
        if (userDtoSql != null) {
            return new ResponseEntity<>("User with ID " + id + " deleted successfully", HttpStatus.OK);

            //return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>("User with ID " + id + " not found", HttpStatus.NOT_FOUND);
        }
    }
}
