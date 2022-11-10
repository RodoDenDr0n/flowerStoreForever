package com.example.flowerstore.items;

import lombok.Getter;

public abstract class Item {
    @Getter private double price;
    @Getter private String description;
}
