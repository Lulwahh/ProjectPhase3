package com.example.SportyShoes.Services;
import com.example.SportyShoes.Dao.AdminRepository;
import com.example.SportyShoes.Entities.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    AdminRepository repo;

    public Iterable<Admin> getAllAdmins() {
        return repo.findAll();
    }

    public void updateAdmin(Admin theAdmin) {
        repo.save(theAdmin);
    }
}
