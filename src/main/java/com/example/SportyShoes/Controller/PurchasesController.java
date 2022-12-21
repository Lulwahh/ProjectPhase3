package com.example.SportyShoes.Controller;

import com.example.SportyShoes.Entities.Category;
import com.example.SportyShoes.Entities.Product;
import com.example.SportyShoes.Entities.Purchases;
import com.example.SportyShoes.Entities.Users;
import com.example.SportyShoes.Services.PurchasesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PurchasesController {
    @Autowired
    PurchasesService service;
    @RequestMapping("/purchases")
    public Iterable<Purchases> getAllPurchases() {
        return service.getAllPurchases();
    }

    @PostMapping("/purchases/add/{user}/{product}")
    void addNewProduct(@RequestBody Purchases p, @PathVariable Integer user,@PathVariable Integer product) {
        p.setProducts(new Product(product,"",0));
        p.setUser(new Users(user,"",0));
        service.addPurchase(p);
    }

    @RequestMapping("/purchases/{id}")
    public Optional<Purchases> getUserById(@PathVariable Integer id) {
        return service.getPurchasesById(id);
    }
    @RequestMapping("/purchases/date/{date}")
    public List<Purchases> findByDate(@PathVariable String date){

        return service.findByDate(date);
    }

    @GetMapping("/purchases/products/category/{cat}")
    public List<Purchases> findByProductsCidCid(@PathVariable Integer cat){
        return service.findByProductsCidCid(cat);
    }

}

