package com.example.SportyShoes.Controller;
import java.util.Optional;

import com.example.SportyShoes.Entities.Users;
import com.example.SportyShoes.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserService service;

    @RequestMapping("/users")
    public Iterable<Users> getAllUsers() {
        return service.getAllUsers();
    }
    @RequestMapping("/users/{id}")
    public Optional<Users> getUserById(@PathVariable Integer id) {
        return service.getUserById(id);
    }

}