package com.example.flowerstore.items;

public class RomashkaFlower extends Item {
    @Override
    public double getPrice() {
        return 50;
    }

    @Override
    public String toString() {
        return String.format("RomashkaFlower{price=%s}", getPrice());
    }
}
