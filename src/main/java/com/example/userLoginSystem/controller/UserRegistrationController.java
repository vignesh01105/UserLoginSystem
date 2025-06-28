package com.example.userLoginSystem.controller;

import com.example.userLoginSystem.Service.UserService;
import com.example.userLoginSystem.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRegistrationController {

   @Autowired
   private UserService userService;



   @PostMapping("/register")
   public Users register(@RequestBody Users user){
      return userService.register(user);

   }

   @PostMapping("/login")
   public String login(@RequestBody Users user){

      return userService.verify(user);
   }

}
