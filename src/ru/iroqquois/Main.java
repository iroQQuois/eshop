package ru.iroqquois;

import ru.iroqquois.factories.ProductFactory;
import ru.iroqquois.factories.UserFactory;
import ru.iroqquois.models.Product;
import ru.iroqquois.models.User;
import ru.iroqquois.services.MainService;

public class Main {
    private static final MainService mainService = new MainService();

    public static void main(String[] args) {
        User user1 = UserFactory.createUser("iroqquois@gmail.com", "12345");
        User user2 = UserFactory.createUser("iroqquois@gmail.com", "12345");

        Product product1 = ProductFactory.createProduct("Арбуз", 100, "Сочный арбуз");
        Product product2 = ProductFactory.createProduct("Апельсин", 20, "Сочный апельсин");

        mainService.addProductToCart(product1, user1, 2);
        mainService.addProductToCart(product1, user2, 3);
        mainService.addProductToCart(product2, user1, 1);
        mainService.addProductToCart(product2, user2, 5);

        System.out.println(user1);
        System.out.println(user2);
    }
}
