package com.basicspringproject.fullstackdemo.controllers;


import com.basicspringproject.fullstackdemo.domain.User;
import com.basicspringproject.fullstackdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin(origins = "*")
@RequestMapping("/account")
public class AccountController {
    UserService userService;

    @Autowired
    public AccountController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/all")
    @ResponseBody
    public List<User> getUsers() {
        return userService.findAll();
    }
}
