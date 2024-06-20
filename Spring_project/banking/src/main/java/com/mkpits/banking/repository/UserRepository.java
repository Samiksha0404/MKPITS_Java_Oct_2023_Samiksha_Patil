package com.mkpits.banking.repository;

import com.mkpits.banking.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
