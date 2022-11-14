package com.example.flowerstore.store;

import com.example.flowerstore.flower.Flower;

import java.util.ArrayList;
import java.util.List;

import static com.example.flowerstore.flower.FlowerColor.*;
import static com.example.flowerstore.flower.FlowerType.*;

public class Store {
    public static void main(String[] args) {
//        Store store = new Store();
//
//        Flower rose1 = new Flower(ROSE, RED, 50.8, 6.3);
//        Flower rose2 = new Flower(ROSE, BLUE, 61.4, 6.5);
//        Flower rose3 = new Flower(ROSE, WHITE, 56.5, 6.4);
//
//        Flower tulip1 = new Flower(TULIP, RED, 42.1, 7.5);
//        Flower tulip2 = new Flower(TULIP, BLUE, 41.9, 7.6);
//        Flower tulip3 = new Flower(TULIP, WHITE, 39.99, 7.4);
//
//        Flower chamomile1 = new Flower(CHAMOMILE, RED, 35.7, 3.5);
//        Flower chamomile2 = new Flower(CHAMOMILE, BLUE, 32.4, 3.4);
//        Flower chamomile3 = new Flower(CHAMOMILE, WHITE, 37.6, 3.6);
//
//        store.addFlower(rose1);
//        store.addFlower(rose2);
//        store.addFlower(rose3);
//
//        store.addFlower(tulip1);
//        store.addFlower(tulip2);
//        store.addFlower(tulip3);
//
//        store.addFlower(chamomile1);
//        store.addFlower(chamomile2);
//        store.addFlower(chamomile3);
//
//        Flower flower = new Flower(ANY_TYPE, RED, 50.8, 6.3);
//        Flower tulip = new Flower(TULIP, ANY_COLOR, 42.1, 7.5);
//        Flower chamomile = new Flower(CHAMOMILE, RED, 35.7, 3.5);
//
//        System.out.println(store.search(flower));
//        System.out.println(store.search(tulip));
//        System.out.println(store.search(chamomile));
//
//        System.out.println(store.flowers.size());
//        store.getFlower(chamomile);
//        System.out.println(store.flowers.size());

    }

    private List<Flower> flowers = new ArrayList<>();
    private List<Flower> searchResults = new ArrayList<>();

    public void addFlower(Flower flower) {
        flowers.add(flower);
    }

    public Flower getFlower(Flower flower) {
        if (flowers.contains(flower)) {
            flowers.remove(flower);
            return flower;
        }
        System.out.println("No such flower available");
        return null;
    }

    public List<Flower> search(Flower searchedFlower) {
        searchResults.clear();
        for (Flower flower : flowers) {
            if ((searchedFlower.getFlowerType() == ANY_TYPE)
                    ^ (searchedFlower.getFlowerType() != flower.getFlowerType())) {
                continue;
            }
            if (!searchedFlower.getColor().equals(ANY_COLOR.toString())
                    ^ searchedFlower.getColor().equals(flower.getColor())) {
                continue;
            }
            searchResults.add(flower);
        }
        return searchResults;
    }
}
