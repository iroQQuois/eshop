package ru.iroqquois.models;

import ru.iroqquois.enums.PaymentType;

import java.time.LocalDate;

public class Order {
    private int id;
    private User user;
    private String address;
    private int phone;
    private PaymentType paymentType;
    private LocalDate deliveryDate;

    public Order(int id, User user, String address, int phone, PaymentType paymentType, LocalDate deliveryDate) {
        this.id = id;
        this.user = user;
        this.address = address;
        this.phone = phone;
        this.paymentType = paymentType;
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", user=" + user +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                ", paymentType=" + paymentType +
                ", deliveryDate=" + deliveryDate +
                '}';
    }
}
