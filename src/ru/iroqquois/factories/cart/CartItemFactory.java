package ru.iroqquois.factories.cart;

import ru.iroqquois.models.Product;
import ru.iroqquois.models.cart.CartItem;

public class CartItemFactory {
    private static int id = 0;

    public static CartItem createCartItem(int count, Product product) {
        CartItem cartItem = new CartItem(id, count, product);
        id++;

        return cartItem;
    }
}
