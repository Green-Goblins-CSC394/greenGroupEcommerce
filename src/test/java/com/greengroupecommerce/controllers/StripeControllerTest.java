package com.greengroupecommerce.controllers;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.web.servlet.view.RedirectView;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.greengroupecommerce.controllers.StripeController;

import static org.junit.jupiter.api.Assertions.assertEquals;

//@SpringBootTest
public class StripeControllerTest {

    @Mock
    RedirectView redirectView;

    @Autowired
    StripeController stripeController;
    /*
    @Test
    public void testMensPage() throws Exception {
        assertEquals(redirectView, stripeController.createCheckoutSession());
    } */
}
