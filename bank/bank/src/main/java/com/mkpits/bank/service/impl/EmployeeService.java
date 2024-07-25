package com.mkpits.bank.service.impl;

import com.mkpits.bank.dto.EmployeeRequestDto;
import com.mkpits.bank.model.Employee;
import com.mkpits.bank.repository.EmployeeRepository;
import com.mkpits.bank.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService  implements IEmployeeService {

    @Autowired
    EmployeeRepository employeeRepo;


    @Override
    public List<EmployeeRequestDto> getAllEmployees() {

        List<Employee> employeeList = (List<Employee>) employeeRepo.findAll();
        List<EmployeeRequestDto> employeeRequestDtoArrayList = new ArrayList<>();
        for (Employee employee : employeeList){
            EmployeeRequestDto getEmployeeRequestDto =  convertEmployeeModelToEmployeeDto(employee);
            employeeRequestDtoArrayList.add(getEmployeeRequestDto);
        }
        return employeeRequestDtoArrayList;
    }

    private EmployeeRequestDto convertEmployeeModelToEmployeeDto(Employee employee) {
        EmployeeRequestDto getEmployeeRequestDto = EmployeeRequestDto.builder()
                .id(employee.getId())
                .fullName(employee.getFullName())
                .email(employee.getEmail())
                .gender(employee.getGender())
                .mobile(employee.getMobile())
                .aadharNo(employee.getAadharNo())
                .dateofbirth(employee.getDateofbirth())
                .state(employee.getState())
                .city(employee.getCity())
                .address(employee.getAddress())
                .build();

        return getEmployeeRequestDto;
    }
}
