package com.mkpits.bank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {


    @GetMapping("/")
    public  String index(){
        return "index";
    }

    @GetMapping("/contact")
    public  String contact(){
        return "contact";
    }

    @GetMapping("/about")
    public  String about(){
        return "about";
    }

    @GetMapping("/service")
    public  String service(){
        return "service";
    }

    @GetMapping("/login")
    public  String login() {
        return "user/login";
        }

    @GetMapping("/registration")
    public String registration() {
        return "user/registration";
    }

    @GetMapping("/forgotPassword")
    public String forgotpassword() {
        return "user/forgotPassword";
    }
    }

