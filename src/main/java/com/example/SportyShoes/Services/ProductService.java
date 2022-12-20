package com.example.SportyShoes.Services;
import com.example.SportyShoes.Dao.AdminRepository;
import com.example.SportyShoes.Dao.ProductRepository;
import com.example.SportyShoes.Entities.Admin;
import com.example.SportyShoes.Entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository repo;

//    public List<Product> getAllProductsByCategoryId(Integer catID) {
//        return repo.findByCatId(catID);
//    }
    public Iterable<Product> getAllProducts() {
        return repo.findAll();
    }

    public void addProduct(Product Product) {
        repo.save(Product);
    }
//
    public void deleteProductById(Integer id) {
        repo.deleteById(id);
    }
//
    public void updateProduct(Product theProduct) {
        repo.save(theProduct);
    }
}
