package com.mkpits.bank.repository;

import com.mkpits.bank.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo  extends JpaRepository<User, Integer> {
}
