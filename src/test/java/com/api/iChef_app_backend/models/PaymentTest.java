package com.api.iChef_app_backend.models;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class PaymentTest {

    @Test
    public void testGetId() {
        Payment payment = new Payment();
        UUID id = UUID.randomUUID();
        payment.setId(id);
        assertEquals(id, payment.getId());
    }

    @Test
    public void testGetDateTime() {
        Payment payment = new Payment();
        LocalDateTime dateTime = LocalDateTime.now();
        payment.setDateTime(dateTime);
        assertEquals(dateTime, payment.getDateTime());
    }

    @Test
    public void testGetAmount() {
        Payment payment = new Payment();
        payment.setAmount(20.99);
        assertEquals(20.99, payment.getAmount(), 0.001);
    }

    @Test
    public void testGetPaymentMethod() {
        Payment payment = new Payment();
        payment.setPaymentMethod("Credit Card");
        assertEquals("Credit Card", payment.getPaymentMethod());
    }

    @Test
    public void testGetOrder() {
        Order order = new Order();
        Payment payment = new Payment();
        payment.setOrder(order);
        assertEquals(order, payment.getOrder());
    }
}