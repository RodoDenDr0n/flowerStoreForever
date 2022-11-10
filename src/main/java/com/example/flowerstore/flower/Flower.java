package com.example.flowerstore.flower;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter @AllArgsConstructor
public class Flower {
    @Getter
    private FlowerType flowerType;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private double sepalLength;
    public Flower() {}
    public String getColor() {
        return color.toString();
    }

    @Override
    public String toString() {
        return String.format("Flower{%s, %s, %s$, %smm}",
                flowerType, color, price, sepalLength);
    }
    @Override
    public boolean equals(Object obj) {
        return getFlowerType() == ((Flower)obj).getFlowerType()
                && getColor().equals(((Flower)obj).getColor())
                && getPrice() == ((Flower)obj).getPrice()
                && getSepalLength() == ((Flower)obj).getSepalLength();
    }
}
