package com.scrf1.simplemessagequeue.controllers;

import com.scrf1.simplemessagequeue.entityDtos.UserDto;
import com.scrf1.simplemessagequeue.models.User;
import com.scrf1.simplemessagequeue.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users")
@CrossOrigin
public class UsersController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public User getUser(@PathVariable("id") Long id) {
        if(id == null)
            return null;

        Optional<User> user = userService.getUserById(id);
        return user.get();
    }

    @PostMapping("/create")
    public User createUser(@RequestBody UserDto userDto) {
        if(userDto == null)
            return null;
        return userService.createUser(userDto);
    }

}
