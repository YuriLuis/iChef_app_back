package com.api.iChef_app_backend.models;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CategoryTest {

    @Test
    public void testGetId() {
        Category category = new Category();
        UUID id = UUID.randomUUID();
        category.setId(id);
        assertEquals(id, category.getId());
    }

    @Test
    public void testGetName() {
        Category category = new Category();
        category.setName("Hamburgers");
        assertEquals("Hamburgers", category.getName());
    }

    @Test
    public void testGetDescription() {
        Category category = new Category();
        category.setDescription("Delicious burgers made with 100% beef.");
        assertEquals("Delicious burgers made with 100% beef.", category.getDescription());
    }

    @Test
    public void testGetProducts() {
        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();
        List<Product> products = Arrays.asList(product1, product2, product3);

        Category category = new Category();
        category.setProducts(products);
        assertEquals(products, category.getProducts());
    }
}