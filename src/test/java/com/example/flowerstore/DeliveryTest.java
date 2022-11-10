package com.example.flowerstore;

import com.example.flowerstore.items.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.example.flowerstore.delivery.Delivery;
import com.example.flowerstore.delivery.DHLDeliveryStrategy;
import com.example.flowerstore.delivery.PostDeliveryStrategy;

import java.util.ArrayList;
import java.util.List;


class DeliveryTest {
    private Delivery delivery1;
    private Delivery delivery2;

    @BeforeEach
    public void init() {
        delivery1 = new DHLDeliveryStrategy();
        delivery2 = new PostDeliveryStrategy();
    }

    @Test
    public void testDHLDeliveryStrategy() {
        List<Item> items = new ArrayList<>();
        items.add(new CactusFlower());
        items.add(new RomashkaFlower());
        items.add(new PaperDecorator());
        delivery1.deliver(items);
//        assertEquals(delivery1.deliver(items), "You will have your items: [CactusFlower{price=50.0}, RomashkaFlower{price=50.0}, PaperDecorator{item=null}] delivered by DHL");
    }

    @Test
    public void testPostDeliveryStrategy() {
        List<Item> items = new ArrayList<>();
        items.add(new CactusFlower());
        items.add(new RomashkaFlower());
        items.add(new PaperDecorator());
        delivery2.deliver(items);
//        assertEquals(delivery1.deliver(items), "You will have your items: [CactusFlower{price=50.0}, RomashkaFlower{price=50.0}, PaperDecorator{item=null}] delivered by DHL");

    }
}
