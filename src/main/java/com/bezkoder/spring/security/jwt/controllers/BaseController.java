package com.bezkoder.spring.security.jwt.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BaseController {
    @GetMapping("/")
    public String home(){
        return "login";
    }
}
