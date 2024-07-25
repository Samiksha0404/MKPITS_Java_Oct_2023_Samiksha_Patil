package com.mkpits.bank.repository;

import com.mkpits.bank.model.UserCredentials;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserCredentialRepository extends JpaRepository<UserCredentials, Integer> {
}
