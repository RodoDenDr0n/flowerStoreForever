package com.example.flowerstore.payments;

public class PayPalPaymentStrategy implements Payment {

    @Override
    public void pay(double price) {
        System.out.printf("You payed %s with PayPal", price);
    }
}
