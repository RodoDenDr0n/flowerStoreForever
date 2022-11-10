package com.example.flowerstore.payments;

public class CreditCardPaymentStrategy implements Payment {

    @Override
    public void pay(double price) {
        System.out.printf("You payed %s with credit card", price);
    }
}
