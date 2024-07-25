package com.mkpits.bank.service;

import com.mkpits.bank.dto.EmployeeRequestDto;


import java.util.List;

public interface IEmployeeService {
    public List<EmployeeRequestDto> getAllEmployees();
}
