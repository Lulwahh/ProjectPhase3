package com.example.SportyShoes.Dao;

import com.example.SportyShoes.Entities.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

//    List<Product> findByCatId(Integer catId);
}
