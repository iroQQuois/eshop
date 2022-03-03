package ru.iroqquois.models;

public class Product {
    private int id;
    private String title;
    private int price;
    private String description;

    public Product(int id, String title, int price, String description) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
