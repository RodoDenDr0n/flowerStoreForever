package com.example.flowerstore.flower;

import com.example.flowerstore.flower.Flower;

public class FlowerPack {
    private Flower flower;
    private int quantity;
    public FlowerPack(Flower flower, int quantity) {
        this.flower = flower;
        this.quantity = quantity;
    }
    public double getPrice() {
        return flower.getPrice() * quantity;
    }
}
