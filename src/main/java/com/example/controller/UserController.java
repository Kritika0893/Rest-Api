package com.example.controller;

import com.example.model.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "user")
@CrossOrigin(origins = "")
public class UserController {

        @Autowired
        private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
        @ResponseStatus(value = HttpStatus.CREATED)
        public User registerUser(@RequestBody User user) {

            return this.userService.insert(user);
        }

        @GetMapping
        @ResponseStatus(value = HttpStatus.OK)
        public List<User> findAllUser() {

            return this.userService.findAll();
        }

        @GetMapping(value = "/{id}")
        @ResponseStatus(value = HttpStatus.OK)
        public User findById(@PathVariable int id) {
            return this.userService.findById(id);
        }

        @PutMapping(value = "/{id}")
        @ResponseStatus(value = HttpStatus.OK)
        public User updateUser(@PathVariable int id, @RequestBody User user) {

            return this.userService.updateUser(id);
        }

        @DeleteMapping(value = "/{id}")
        @ResponseStatus(value = HttpStatus.NO_CONTENT)
        public void deleteUser(@PathVariable int id) {

            this.userService.delete(id);
        }
    }

