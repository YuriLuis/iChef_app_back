package com.api.iChef_app_backend.models;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClientTest {

    @Test
    public void testGetId() {
        Client client = new Client();
        client.setId(123L);
        assertEquals(123L, client.getId());
    }

    @Test
    public void testGetName() {
        Client client = new Client();
        client.setName("John Smith");
        assertEquals("John Smith", client.getName());
    }

    @Test
    public void testGetEmail() {
        Client client = new Client();
        client.setEmail("john.smith@example.com");
        assertEquals("john.smith@example.com", client.getEmail());
    }

    @Test
    public void testGetPhone() {
        Client client = new Client();
        client.setPhone("555-555-5555");
        assertEquals("555-555-5555", client.getPhone());
    }

    @Test
    public void testGetAddress() {
        Client client = new Client();
        Address address = new Address();
        address.setCity("Florida");
        assertEquals("Florida", client.getAddress().getCity());
    }

    @Test
    public void testGetOrders() {
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order();
        List<Order> orders = Arrays.asList(order1, order2, order3);

        Client client = new Client();
        client.setOrders(orders);
        assertEquals(orders, client.getOrders());
    }
}
