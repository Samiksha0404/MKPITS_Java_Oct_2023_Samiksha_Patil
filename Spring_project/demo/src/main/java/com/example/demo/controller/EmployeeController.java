package com.example.demo.controller;

import com.example.demo.dto.AddressDto;
import com.example.demo.dto.EmployeeDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController
{

//    @RequestMapping("/employees")
//    public ResponseEntity<EmployeeDto> getEmployee(){
//        EmployeeDto employeeDto = new EmployeeDto();
//        employeeDto.setName("Harsh ");
//        employeeDto.setDepartment("Tech");
//        employeeDto.setDesignation("Full Stack");
//
//
//        AddressDto[] addressDto = new AddressDto[3];
//        addressDto[0] = new AddressDto();
//        addressDto[0].setAddressType('H');
//        addressDto[0].setHouse("101");
//        addressDto[0].setStreet("adiwasi colony");
//        addressDto[0].setCity("orange city");
//        addressDto[0].setCountry("India");
//        addressDto[0].setState("Maharashtra");
//
//        addressDto[1] = new AddressDto();
//        addressDto[1].setAddressType('A');
//        addressDto[1].setHouse("201");
//        addressDto[1].setStreet("walkers");
//        addressDto[1].setCity("nagpur");
//        addressDto[1].setCountry("India");
//        addressDto[1].setState("Maharashtra");
//
//        addressDto[2] = new AddressDto();
//        addressDto[2].setAddressType('R');
//        addressDto[2].setHouse("301");
//        addressDto[2].setStreet("futala");
//        addressDto[2].setCity("ngp");
//        addressDto[2].setCountry("India");
//        addressDto[2].setState("MH");
//
//        employeeDto.setAddress(addressDto);
//        return ResponseEntity.ok(employeeDto);
//    }



}
