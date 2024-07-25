package com.mkpits.bank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

public class DashBoardController {



    @Controller
    public class DashboardController {

        @GetMapping("/dashboard")
        public String dashboard() {
            return "dashboard";
        }
    }
}
