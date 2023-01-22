package com.api.iChef_app_backend.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AddressTest {

    @Test
    public void testGetId() {
        Address address = new Address();
        address.setId(123L);
        assertEquals(123L, address.getId());
    }

    @Test
    public void testGetStreetName() {
        Address address = new Address();
        address.setStreetName("Main St.");
        assertEquals("Main St.", address.getStreetName());
    }

    @Test
    public void testGetStreetNumber() {
        Address address = new Address();
        address.setStreetNumber("123");
        assertEquals("123", address.getStreetNumber());
    }

    @Test
    public void testGetNeighborhood() {
        Address address = new Address();
        address.setNeighborhood("Downtown");
        assertEquals("Downtown", address.getNeighborhood());
    }

    @Test
    public void testGetCity() {
        Address address = new Address();
        address.setCity("New York");
        assertEquals("New York", address.getCity());
    }

    @Test
    public void testGetState() {
        Address address = new Address();
        address.setState("NY");
        assertEquals("NY", address.getState());
    }

    @Test
    public void testGetZipCode() {
        Address address = new Address();
        address.setZipCode("10001");
        assertEquals("10001", address.getZipCode());
    }
}