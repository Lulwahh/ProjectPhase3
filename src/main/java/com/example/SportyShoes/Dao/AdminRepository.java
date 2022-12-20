package com.example.SportyShoes.Dao;
import com.example.SportyShoes.Entities.Admin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AdminRepository extends CrudRepository<Admin, Integer> {
}