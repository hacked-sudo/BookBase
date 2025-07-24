package com.slb.project.controller;

import com.slb.project.entity.User;
import com.slb.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/public")
public class PublicController {

    @Autowired
    UserService userService;

    @PostMapping("create-user")
    public void createUser(@RequestBody User user) {
        userService.saveEntry(user);

    }

}
