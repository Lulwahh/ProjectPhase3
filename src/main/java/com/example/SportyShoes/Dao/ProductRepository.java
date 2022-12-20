package com.example.SportyShoes.Dao;

import com.example.SportyShoes.Entities.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Integer> {

//    List<Product> findByCatId(Integer catId);
}
