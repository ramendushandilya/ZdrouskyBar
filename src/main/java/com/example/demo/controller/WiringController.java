package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author rams0516
 *         Date: 1/11/2018
 *         Time: 4:38 PM
 */

@Controller
public class WiringController {

    @RequestMapping("/userLanding")
    public String showLanding() {
        return "userLanding";
    }

    @RequestMapping("/support")
    public String showSupport() {
        return "support";
    }

    @RequestMapping("/cart")
    public String showCart() {
        return "cart";
    }

    @RequestMapping("/account")
    public String showAccount() {
        return "account";
    }

    @RequestMapping("/")
    public String showHome() {
        return "home";
    }

    @RequestMapping("/logout")
    public String logOut() {
        System.out.print("User logged out");
        return "home";
    }
}