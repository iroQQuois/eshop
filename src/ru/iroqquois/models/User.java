package ru.iroqquois.models;

import ru.iroqquois.factories.cart.CartFactory;
import ru.iroqquois.models.cart.Cart;

public class User {
    private int id;
    private String email;
    private String password;
    private Cart cart;

    public User(int id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.cart = CartFactory.createCart();
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", cart=" + cart +
                '}';
    }
}
