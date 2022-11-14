package com.example.flowerstore.flower;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flower")
public class FlowerController {
    @Autowired
    private FlowerService flowerService;

//    @Autowired
//    public FlowerController(FlowerService flowerService) {
//        this.flowerService = flowerService;
//    }

    @GetMapping("/all")
    public List<Flower> getFlower() {
        return flowerService.getFlower();
    }

    @PostMapping("/add")
    public void addFlower(@RequestBody Flower flower) {
        flowerService.addFlower(flower);
    }
}
