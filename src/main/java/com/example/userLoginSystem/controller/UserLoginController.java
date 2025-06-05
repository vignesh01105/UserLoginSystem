package com.example.userLoginSystem.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserLoginController {

    @GetMapping("/message")
    public String message(HttpServletRequest request){
        return "Welcome to UserLogin"+ request.getSession().getId();
    }

    @GetMapping("/secure")
    public String secure(HttpServletRequest request1){
        return "You are authenticated"+ request1.getSession().getId();
    }

    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request){

        return (CsrfToken) request.getAttribute("_csrf");
    }
}
