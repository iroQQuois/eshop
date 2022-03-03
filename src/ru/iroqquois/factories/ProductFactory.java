package ru.iroqquois.factories;

import ru.iroqquois.models.Product;

public class ProductFactory {
    private static int id = 0;

    public static Product createProduct(String title, int price, String description) {
        Product product = new Product(id, title, price, description);
        id++;

        return product;
    }
}
