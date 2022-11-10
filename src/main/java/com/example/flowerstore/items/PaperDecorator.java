package com.example.flowerstore.items;

public class PaperDecorator extends ItemDecorator {
    private Item item;

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public double getPrice() {
        return 13 + item.getPrice();
    }

    @Override
    public String toString() {
        return "PaperDecorator{" +
                "item=" + item +
                '}';
    }
}
