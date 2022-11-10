package com.example.flowerstore.controllers;

import com.example.flowerstore.flower.Flower;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication @RestController
public class FlowerStoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlowerStoreApplication.class, args);
    }

    @RequestMapping @GetMapping
    public static List<Flower> getFlowerList(Flower... flowers) {
        return List.of(flowers);
    }
}
