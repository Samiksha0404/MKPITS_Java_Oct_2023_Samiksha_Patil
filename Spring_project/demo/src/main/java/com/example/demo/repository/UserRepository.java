package com.example.demo.repository;

import com.example.demo.mysql.model.UserModel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<UserModel, Integer> {

}
