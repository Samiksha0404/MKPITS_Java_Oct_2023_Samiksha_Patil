package com.example.demo.validator;


import com.example.demo.exception.IdNotFoundException;
import org.springframework.stereotype.Component;
import java.time.LocalDate;

@Component
public class UserValidator {

    public boolean validateAge(LocalDate dateOfBirth) {
        if (dateOfBirth == null) {
            return false;
        } else {
            LocalDate currentDate = LocalDate.now();
            int age = currentDate.getYear() - dateOfBirth.getYear();
            if (age < 18) {
                return false;
            } else {
                return true;
            }
        }

    }

    public boolean idNotFound(Integer id) {

        if (id == null){
            throw new IdNotFoundException(" Id does not exist");
        }else {
            return true;
        }
    }
}
