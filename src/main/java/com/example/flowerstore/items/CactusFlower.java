package com.example.flowerstore.items;

import lombok.Getter;

public class CactusFlower extends Item {
    @Getter
    private double price = 50;

    @Override
    public String toString() {
        return String.format("CactusFlower{price=%s}", getPrice());
    }
}
