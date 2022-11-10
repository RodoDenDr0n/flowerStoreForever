package com.example.flowerstore.orders;

import com.example.flowerstore.delivery.Delivery;
import com.example.flowerstore.items.Item;
import com.example.flowerstore.payments.Payment;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Order {
    List<Item> items = new ArrayList<>();
    @Setter Payment paymentStrategy;
    @Setter Delivery deliveryStrategy;

    public double calculateTotalPrice() {
        double totalPrice = 0;

        for (Item item : items) {
            totalPrice += item.getPrice();
        }

        return totalPrice;
    }

    public void processOrder() {
        paymentStrategy.pay(calculateTotalPrice());
        deliveryStrategy.deliver(items);
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }
}
