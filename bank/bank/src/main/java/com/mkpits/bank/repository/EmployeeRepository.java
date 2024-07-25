package com.mkpits.bank.repository;

import com.mkpits.bank.model.Employee;
import com.mkpits.bank.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
