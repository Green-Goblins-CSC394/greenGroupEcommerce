package com.greengroupecommerce.controllers;


import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.ui.Model;

import com.greengroupecommerce.controllers.CheckoutController;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CheckoutControllerTest {
    @Mock
    Model model;

    @Autowired
    CheckoutController checkoutController;

    @Test
    public void testCheckoutPage() {
        assertEquals("checkout", checkoutController.checkoutPage(model));
    }
}
