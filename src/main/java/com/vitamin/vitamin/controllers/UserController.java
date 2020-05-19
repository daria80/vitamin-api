package com.vitamin.vitamin.controllers;

import com.vitamin.vitamin.models.User;
import com.vitamin.vitamin.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping// create a user
    public User save(@RequestBody User user) {
        return userService.save(user);
    }

    @PostMapping("/{id}")// create the user by id
    public User update(@PathVariable long id, @RequestBody User user) {
        return  userService.update(id, user);
    }

    @GetMapping// read all users
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("/{id}")// read the user by id
    public User findById(@PathVariable long id) {
        return userService.findById(id);
    }

    @DeleteMapping("/{id}")// delete the user by id
    public void deleteById(@PathVariable long id) {
        userService.deleteById(id);
    }
}
