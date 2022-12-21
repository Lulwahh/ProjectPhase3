package com.example.SportyShoes.Entities;

import jakarta.persistence.*;
@Entity
public class Purchases {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    int id;

    String date;

    @OneToOne
    private Users user;

    @OneToOne
    private Product products;


    public Purchases(int id,String date, Users user, Product products) {
        this.id = id;
        this.date=date;
        this.user = user;
        this.products = products;
    }
    public Purchases(int id,String date, int user, int product) {
        this.id = id;
        this.date=date;
        this.user = new Users(user,"",0);
        this.products = new Product(product,"",0);
    }

    public Purchases() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Users getUser() {
        return user;
    }
    public Users getUser(int id) {
        if (this.user.getId()==id)
            return user;
        else return null;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Product getProducts() {
        return products;
    }
    public Product getProducts(int id) {
        if (this.products.getId()==id)
            return products;
        else return null;
    }

    public void setProducts(Product products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Purchases{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", user=" + user +
                ", products=" + products +
                '}';
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
