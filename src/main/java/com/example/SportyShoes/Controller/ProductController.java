package com.example.SportyShoes.Controller;

import com.example.SportyShoes.Entities.Admin;
import com.example.SportyShoes.Entities.Category;
import com.example.SportyShoes.Entities.Product;
import com.example.SportyShoes.Services.AdminService;
import com.example.SportyShoes.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService service;

//    @GetMapping("/products/cat/{catId}")
//    List<Product> getAllProductsByCategoryId(@PathVariable Integer catId) {
//        return service.getAllProductsByCategoryId(catId);
//    }

    @RequestMapping("/products")
    public Iterable<Product> getAllProducts() {
        return service.getAllProducts();
    }

    @PostMapping("/products/add/{catId}")
    void addNewProduct(@RequestBody Product p, @PathVariable Integer catId) {
        p.setCategory(new Category(catId, ""));
        service.addProduct(p);
    }

    @PostMapping("/product/update/{catId}")
    void updateNewProduct(@RequestBody Product p, @PathVariable Integer catId) {
        p.setCategory(new Category(catId, ""));
        service.updateProduct(p);
    }

    @DeleteMapping("/products/delete/{pId}")
    void deletePlaceById(@PathVariable Integer pId) {
        service.deleteProductById(pId);
    }

}
