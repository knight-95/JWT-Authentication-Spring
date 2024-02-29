package com.jwt.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.models.User;
import com.jwt.services.UserService;

import java.security.Principal;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private UserService userService;
    
    
    @GetMapping("/users")
    public ArrayList<User> getUser() {
        System.out.println("Getting users");
        return userService.getUsers();
    }
    
    @GetMapping("/current-user")
    public String getLoggedInUser(Principal principal) {
        return principal.getName();
    }
    
   
}
