package ru.iroqquois.services;

import ru.iroqquois.factories.cart.CartItemFactory;
import ru.iroqquois.models.Product;
import ru.iroqquois.models.User;
import ru.iroqquois.models.cart.Cart;
import ru.iroqquois.models.cart.CartItem;

public class MainService {
    public void addProductToCart(Product product, User user, int count) {
        Cart cart = user.getCart();
        CartItem cartItem = CartItemFactory.createCartItem(2, product);
        cart.getCartItems().add(cartItem);
    }
}
