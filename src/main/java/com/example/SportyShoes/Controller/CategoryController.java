package com.example.SportyShoes.Controller;
import com.example.SportyShoes.Entities.Admin;
import com.example.SportyShoes.Entities.Category;
import com.example.SportyShoes.Services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import com.example.SportyShoes.Dao;
@RestController
public class CategoryController {
    @Autowired
    CategoryService service;
    @RequestMapping("/categories")
    public Iterable<Category> getAllCategories() {
        return service.getAllCategories();
    }


}
