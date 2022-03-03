package ru.iroqquois.factories.cart;

import ru.iroqquois.models.cart.Cart;

public class CartFactory {
    private static int id = 0;

    public static Cart createCart() {
        Cart cart = new Cart(id);
        id++;

        return cart;
    }
}
