package com.example.SportyShoes.Services;
import java.util.Optional;

import com.example.SportyShoes.Dao.UserRepository;
import com.example.SportyShoes.Entities.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository repo;

    public Iterable<Users> getAllUsers() {
        return repo.findAll();
    }

    public Optional<Users> getUserById(int id) {
        return repo.findById(id);
    }

}