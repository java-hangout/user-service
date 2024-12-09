package com.kt.ts.userservice.controller;

import com.kt.ts.userservice.model.User;
import com.kt.ts.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        return userService.registerUser(user);
    }

    @GetMapping("/{username}")
    public User getUser(@PathVariable String username) {
        System.out.println("username --->>> getUser in user controller .....>>> " + username);
        return userService.getUser(username);
    }

    @PutMapping("/{id}")
    public User updateTicket(@PathVariable String id, @RequestBody User user) {
        user.setUserId(id);
        return userService.updateUser(user);
    }

    @GetMapping("/dashboard")
    public String userDashboard() {
        return "Welcome to the User Dashboard!";
    }
}
