package com.example.SportyShoes.Services;

import com.example.SportyShoes.Dao.CategoryRepository;
import com.example.SportyShoes.Dao.PurchasesRepository;
import com.example.SportyShoes.Entities.Category;
import com.example.SportyShoes.Entities.Product;
import com.example.SportyShoes.Entities.Purchases;
import com.example.SportyShoes.Entities.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PurchasesService {

    @Autowired
    PurchasesRepository repo;

    public Iterable<Purchases> getAllPurchases() {
        return repo.findAll();
    }

    public void addPurchase(Purchases purchase) {
        repo.save(purchase);
    }
    public Optional<Purchases> getPurchasesById(int id) {
        return repo.findById(id);
    }

    public List<Purchases> findByDate(String date) {
        return repo.findByDate(date);
    }

    public List<Purchases> findByProductsCidCid(Integer cat) {
        return repo.findByProductsCidCid(cat);
    }
}
