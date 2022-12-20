package com.example.SportyShoes.Controller;
import com.example.SportyShoes.Entities.Admin;
import com.example.SportyShoes.Services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import com.example.SportyShoes.Dao;
@RestController
public class AdminController {
    @Autowired
    AdminService service;
    @RequestMapping("/admins")
    public Iterable<Admin> getAllAdmins() {

        return service.getAllAdmins();
    }
    @PutMapping("/admin")
    public void updateAdmin(@RequestBody Admin theAdmin) {
        service.updateAdmin(theAdmin);
    }
}
