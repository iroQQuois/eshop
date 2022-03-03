package ru.iroqquois.models.cart;

import ru.iroqquois.models.Product;

public class CartItem {
    private int id;
    private int count;
    private Product product;

    public CartItem(int id, int count, Product product) {
        this.id = id;
        this.count = count;
        this.product = product;
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "id=" + id +
                ", count=" + count +
                ", product=" + product +
                '}';
    }
}
