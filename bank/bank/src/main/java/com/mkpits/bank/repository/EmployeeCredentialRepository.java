package com.mkpits.bank.repository;

import com.mkpits.bank.model.EmployeeCredentials;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeCredentialRepository extends JpaRepository <EmployeeCredentials, Integer> {
}
