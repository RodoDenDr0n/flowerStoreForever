package com.example.flowerstore;

import com.example.flowerstore.delivery.DHLDeliveryStrategy;
import com.example.flowerstore.delivery.Delivery;
import com.example.flowerstore.delivery.PostDeliveryStrategy;
import com.example.flowerstore.items.CactusFlower;
import com.example.flowerstore.items.Item;
import com.example.flowerstore.items.PaperDecorator;
import com.example.flowerstore.items.RomashkaFlower;
import com.example.flowerstore.payments.CreditCardPaymentStrategy;
import com.example.flowerstore.payments.PayPalPaymentStrategy;
import com.example.flowerstore.payments.Payment;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class PaymentTest {
    private Payment payment1;
    private Payment payment2;

    @BeforeEach
    public void init() {
        payment1 = new CreditCardPaymentStrategy();
        payment2 = new PayPalPaymentStrategy();
    }

    @Test
    public void testCreditCardPaymentStrategy() {
        double price = 50.45;
        payment1.pay(price);
//        assertEquals(payment1.pay(price), "You paid 50.45 with credit card");
    }

    @Test
    public void testPayPalPaymentStrategy() {
        double price = 50.45;
        payment2.pay(price);
//        assertEquals(payment2.pay(price), "You paid 50.45 with credit card");
    }
}
