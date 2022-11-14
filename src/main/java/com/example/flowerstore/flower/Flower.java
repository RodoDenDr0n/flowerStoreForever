package com.example.flowerstore.flower;

import com.example.flowerstore.items.Item;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.concurrent.Flow;

@Setter @Getter @Entity
@Table(name = "flower")
@NoArgsConstructor
public class Flower extends Item {
    @Id
    @GeneratedValue
    private Integer id;
    @Enumerated(EnumType.STRING)
    private FlowerType flowerType;
    @Enumerated(EnumType.STRING)
    private FlowerColor color;
    private double price;
    private double sepalLength;


//    public Flower(FlowerColor color, int sepalLength, double price) {
//        this.color = color;
//        this.sepalLength = sepalLength;
//        this.price = price;
//    }

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
