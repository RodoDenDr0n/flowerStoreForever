package com.example.flowerstore.delivery;

import com.example.flowerstore.items.Item;

import java.util.List;

public class DHLDeliveryStrategy implements Delivery {
    @Override
    public void deliver(List<Item> items) {
        System.out.printf("You will have your items: %s delivered by DHL", items);
    }
}
