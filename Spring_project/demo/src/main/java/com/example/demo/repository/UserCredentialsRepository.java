package com.example.demo.repository;

import com.example.demo.mysql.model.UserCredential;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserCredentialsRepository extends CrudRepository<UserCredential , Integer> {


}