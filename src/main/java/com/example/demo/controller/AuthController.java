package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by failedOptimus on 10-01-2018.
 */

@Controller
public class AuthController {

    @RequestMapping("/")
    public String showHome() {
        return "index";
    }

    @RequestMapping("/index")
    public String showIndex() {
        return "index";
    }

    @RequestMapping("/register")
    public String showRegister() {
        return "register";
    }

}
