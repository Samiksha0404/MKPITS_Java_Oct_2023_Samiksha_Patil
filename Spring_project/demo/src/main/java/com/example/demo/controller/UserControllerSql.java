package com.example.demo.controller;

import com.example.demo.dto.request.UserRequestDto;
import com.example.demo.dto.response.ErrorResponseDto;
import com.example.demo.service.IUserSql;
import com.example.demo.validator.UserValidator;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import com.example.demo.dto.response.UserGetResponseDto;
import com.example.demo.dto.response.UserPostResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
public class UserControllerSql {

    @Autowired

    IUserSql iUserSql;

    @Autowired
    UserValidator userValidator;


//    @RequestMapping(value = "/v1/users/{id}", method = RequestMethod.GET)
     @GetMapping(path = "/v1/users/{id}")
    public ResponseEntity<Object> getUser(@PathVariable("id") Integer id) {
        UserGetResponseDto userDtoSql = iUserSql.getUserById(id);
         boolean isNotFound = userValidator.idNotFound(userDtoSql.getId());
       // System.out.println("Service Constructor: " + iUserSql.hashCode());
        return ResponseEntity.ok(userDtoSql);

    }

//    @RequestMapping(value = "/v1/users/{id}", method = RequestMethod.PUT)
        @PutMapping(path = "/v1/users/{id}")
    public ResponseEntity<Object> updateUser(@PathVariable("id") Integer id, @RequestBody UserRequestDto userDtoSql) {
        userDtoSql.setId(id);

        UserRequestDto userDtoReturn = iUserSql.updateUser(userDtoSql);
        return ResponseEntity.ok(userDtoSql);
    }

//    @RequestMapping(value = "/v1/users", method = RequestMethod.GET)
@GetMapping(path = "/v1/users", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getAllUsers() {
    List<UserGetResponseDto> userGetResponseDtoList = iUserSql.getAllUsers();
    return ResponseEntity.ok(userGetResponseDtoList);

    }
//    @RequestMapping(value = "/v1/users/{id}", method = RequestMethod.PATCH)
@PatchMapping(path = "/v1/users/{id}")
    public ResponseEntity<Object> updatePatchUser(@PathVariable("id") Integer id, @RequestBody UserRequestDto userDtoSql) {
        userDtoSql.setId(id);
        UserRequestDto userDtoReturn = iUserSql.updatePatchUser(userDtoSql);
        return ResponseEntity.ok(userDtoSql);
    }

    //@RequestMapping(value = "/v1/users", method = RequestMethod.POST)
    @PostMapping(path = "/v1/users")
    public ResponseEntity<Object> createUser(@Valid @RequestBody UserRequestDto userRequestDto) {
        boolean isValidAge = userValidator.validateAge(userRequestDto.getDob());
        if (!isValidAge) {
            ErrorResponseDto errorResponseDto = ErrorResponseDto.builder()
                    .errorMessage("Age should be greated than 18 yrs")
                    .httStatusCode(HttpStatus.BAD_REQUEST.value())
                    .build();
            return ResponseEntity.badRequest().body(errorResponseDto);
        }

        UserPostResponseDto userResponseDto = iUserSql.createUser(userRequestDto);
        return ResponseEntity.created(URI.create("/v1/users" + userResponseDto.getId())).body(userResponseDto);
    }


    //@RequestMapping(value = "/v1/users/{id}", method = RequestMethod.DELETE)
    @DeleteMapping(path = "/v1/users/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") Integer id) {
        UserRequestDto userDtoSql = iUserSql.deleteUserById(id);
        if (userDtoSql != null) {
            return new ResponseEntity<>("User with ID " + id + " deleted successfully", HttpStatus.OK);

            //return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>("User with ID " + id + " not found", HttpStatus.NOT_FOUND);
        }
    }
}
