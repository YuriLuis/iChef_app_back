package com.api.iChef_app_backend.models;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderTest {

    @Test
    public void testGetId() {
        Order order = new Order();
        UUID id = UUID.randomUUID();
        order.setId(id);
        assertEquals(id, order.getId());
    }

    @Test
    public void testGetDateTime() {
        Order order = new Order();
        LocalDateTime dateTime = LocalDateTime.now();
        order.setDateTime(dateTime);
        assertEquals(dateTime, order.getDateTime());
    }

    @Test
    public void testGetCustomer() {
        Client client = new Client();
        Order order = new Order();
        order.setClient(client);
        assertEquals(client, order.getClient());
    }

    @Test
    public void testGetDeliveryAddress() {
        Order order = new Order();
        order.setDeliveryAddress("123 Main St.");
        assertEquals("123 Main St.", order.getDeliveryAddress());
    }

    @Test
    public void testGetTotalPrice() {
        Order order = new Order();
        order.setTotalPrice(20.99);
        assertEquals(20.99, order.getTotalPrice(), 0.001);
    }

    @Test
    public void testGetPayment() {
        Order order = new Order();
        Payment payment = new Payment();
        payment.setAmount(123.44);
        order.setPayment(payment);
        assertEquals(123.44, order.getPayment().getAmount(), 0.001);
    }
}
