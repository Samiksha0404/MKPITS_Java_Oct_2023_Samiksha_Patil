package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstController {


    @RequestMapping("/")
    public String getData(){
        return "Hello Boss";
    }
}
