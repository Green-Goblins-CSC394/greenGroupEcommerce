package com.greengroupecommerce.controllers;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.ui.Model;

import com.greengroupecommerce.controllers.CartController;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CartControllerTest {

    @Mock
    Model model;

    @Autowired
    CartController cartController;

    @Test
    public void testCartPage() {
        assertEquals("cart", cartController.cartPage(model));
    }
}