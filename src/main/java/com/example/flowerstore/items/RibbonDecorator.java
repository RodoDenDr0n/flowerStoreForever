package com.example.flowerstore.items;

public class RibbonDecorator extends ItemDecorator {
    private Item item;

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public double getPrice() {
        return 40 + item.getPrice();
    }

    @Override
    public String toString() {
        return "RibbonDecorator{" +
                "item=" + item +
                '}';
    }
}
