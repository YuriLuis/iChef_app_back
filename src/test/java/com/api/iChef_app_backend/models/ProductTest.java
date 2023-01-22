package com.api.iChef_app_backend.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductTest {

    @Test
    public void testGetId() {
        Product product = new Product();
        product.setId(123L);
        assertEquals(123L, product.getId());
    }

    @Test
    public void testGetName() {
        Product product = new Product();
        product.setName("Classic Burger");
        assertEquals("Classic Burger", product.getName());
    }

    @Test
    public void testGetDescription() {
        Product product = new Product();
        product.setDescription("A classic burger.");
        assertEquals("A classic burger.", product.getDescription());
    }

    @Test
    public void testGetPrice() {
        Product product = new Product();
        product.setPrice(6.99);
        assertEquals(6.99, product.getPrice(), 0.001);
    }

    @Test
    public void testGetCategory() {
        Category category = new Category();
        Product product = new Product();
        product.setCategory(category);
        assertEquals(category, product.getCategory());
    }

    @Test
    public void testGetImageUrl() {
        Product product = new Product();
        product.setImageUrl("https://example.com/products/classic-burger.jpg");
        assertEquals("https://example.com/products/classic-burger.jpg", product.getImageUrl());
    }
}