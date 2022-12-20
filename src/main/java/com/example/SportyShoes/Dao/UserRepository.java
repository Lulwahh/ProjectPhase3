package com.example.SportyShoes.Dao;
import com.example.SportyShoes.Entities.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends CrudRepository<Users, Integer> {
}