package com.example.demo.config;

import com.example.demo.dto.response.ErrorResponseDto;
import com.example.demo.exception.BusinessException;
import com.example.demo.exception.IdNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
//@RestControllerAdvice is used to handle exceptions globally across all REST controllers.
// This means you don't need to repeat exception handling code in each controller.

public class CustomExceptionHandler {

    // @ExceptionHandler annotation in Spring defines methods to handle specific exceptions. These methods can be in a controller or a global handler class
    // (@ControllerAdvice or @RestControllerAdvice), centralizing exception handling for cleaner, more maintainable code.
    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleException(Exception ex) {
        ErrorResponseDto errorResponseDto = new ErrorResponseDto();
        errorResponseDto.setErrorMessage(ex.getMessage());
        errorResponseDto.setHttStatusCode(400);
        return ResponseEntity.badRequest().body(errorResponseDto);
    }

    @ExceptionHandler(IdNotFoundException.class) // Assuming IdNotFoundException is your custom exception class
    public ResponseEntity<Object> handleIdNotFoundException(IdNotFoundException ex) {
        ErrorResponseDto errorResponseDto = new ErrorResponseDto();
        errorResponseDto.setErrorMessage( ex.getMessage()); // Assuming your custom exception class has a method getId() to retrieve the ID
        errorResponseDto.setHttStatusCode(404); // Using 404 for resource not found
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponseDto);
    }



    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<Object> handleBusinessException(BusinessException ex) {
        ErrorResponseDto errorResponseDto = new ErrorResponseDto();
        errorResponseDto.setErrorMessage(ex.getMessage());
        errorResponseDto.setHttStatusCode(HttpStatus.BAD_REQUEST.value());
        return ResponseEntity.badRequest().body(errorResponseDto);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Object> handleHibernateValidationException(MethodArgumentNotValidException ex) {
        ErrorResponseDto errorResponseDto = new ErrorResponseDto();
        errorResponseDto.setErrorMessage(ex.getMessage());
        errorResponseDto.setHttStatusCode(HttpStatus.BAD_REQUEST.value());
        return ResponseEntity.badRequest().body(errorResponseDto);
    }
}