package com.example.flowerstore.items;

public class BasketDecorator extends ItemDecorator {
    private Item item;

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public double getPrice() {
        return 4 + item.getPrice();
    }

    @Override
    public String toString() {
        return String.format("BasketDecorator{item=%s}", item);
    }
}
