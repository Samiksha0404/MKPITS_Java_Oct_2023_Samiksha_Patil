package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MySecondController {


    @RequestMapping("/name")
    public String getName(){

        return "Pranav Armarkar";
    }
}
