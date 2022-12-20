package com.example.SportyShoes.Services;

import com.example.SportyShoes.Dao.CategoryRepository;
import com.example.SportyShoes.Entities.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository repo;

    public Iterable<Category> getAllCategories() {
        return repo.findAll();
    }

}
