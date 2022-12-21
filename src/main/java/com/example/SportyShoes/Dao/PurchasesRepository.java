package com.example.SportyShoes.Dao;

import com.example.SportyShoes.Entities.Purchases;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PurchasesRepository extends CrudRepository<Purchases, Integer> {
    List<Purchases> findByDate(String date);
    List<Purchases> findByProductsCidCid(Integer cat);

}
