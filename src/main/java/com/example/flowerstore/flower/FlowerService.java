package com.example.flowerstore.flower;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class FlowerService {
    @Autowired
    private FlowerRepository flowerRepository;

    public FlowerService(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }

    public List<Flower> getFlower() {
        return flowerRepository.findAll();
    }

    public void addFlower(@RequestBody Flower flower) {
        flowerRepository.save(flower);
    }
}