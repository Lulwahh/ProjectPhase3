package com.example.SportyShoes.Entities;

import jakarta.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    int id;
    String brand;
    @ManyToOne
    private Category cid;

    public Product() {
    }

    public Product(int id, String brand, Integer catID) {
        this.id = id;
        this.brand = brand;

        this.cid = new Category(catID," ");
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", category=" + cid +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Category getCategory() {
        return cid;
    }

    public void setCategory(Category category) {
        this.cid
                = category;
    }
}
