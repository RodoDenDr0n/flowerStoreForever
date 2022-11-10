package com.example.flowerstore.items;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlowerBucket extends Item {
    private final List<Item> bucket = new ArrayList<>();

    public boolean searchFlower(Item flower) {
        return bucket.contains(flower);
    }

    public void addFlowers(Item ... flowers) {
        bucket.addAll(Arrays.asList(flowers));
    }

    @Override
    public double getPrice() {
        double result = 0;
        for (Item pack : bucket) {
            result += pack.getPrice();
        }
        return result;
    }

    @Override
    public String toString() {
        return "FlowerBucket{" +
                "bucket=" + bucket +
                '}';
    }
}
