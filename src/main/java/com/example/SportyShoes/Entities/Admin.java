package com.example.SportyShoes.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Admin {
    @Id
    String username;
    int password;

    public Admin() {
    }

    public Admin(String username, int password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "username='" + username + '\'' +
                ", password=" + password +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
