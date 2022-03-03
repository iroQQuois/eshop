package ru.iroqquois.models.cart;

import java.util.ArrayList;

public class Cart {
    private int id;
    private ArrayList<CartItem> cartItems = new ArrayList<>();

    public Cart(int id) {
        this.id = id;
    }

    public ArrayList<CartItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(ArrayList<CartItem> cartItems) {
        this.cartItems = cartItems;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", cartItems=" + cartItems +
                '}';
    }
}
