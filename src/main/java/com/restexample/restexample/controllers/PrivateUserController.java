package com.restexample.restexample.controllers;

import com.restexample.restexample.models.PrivateUser;
import com.restexample.restexample.repositories.PrivateUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/users")
public class PrivateUserController {

    @Autowired
    private PrivateUserRepository privateUserRepository;

    @GetMapping("/hello")
    public String index() {
       return "Hello from /users/hello !";
   }

    @GetMapping("")
    public Iterable<PrivateUser> list() {
        return privateUserRepository.findAll();
    }

    @PostMapping("")
    public PrivateUser create(@RequestBody PrivateUser privateUser) {
        privateUserRepository.save(privateUser);
        return privateUser;
    }

}
