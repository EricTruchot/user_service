package com.noteverse.user_service.api.controller;

import com.noteverse.user_service.api.model.User;
import com.noteverse.user_service.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

 @GetMapping("/user")
    public User getUser(@RequestParam Integer id){
        Optional<User> user = userService.getUser(id);
        return (User) user.orElse(null);
    }

@GetMapping("/")
public List<User> getAllUsers() {
    return userService.getAllUsers();
}
}