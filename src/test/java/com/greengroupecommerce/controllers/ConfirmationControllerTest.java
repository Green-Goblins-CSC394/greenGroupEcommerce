package com.greengroupecommerce.controllers;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.ui.Model;

import com.greengroupecommerce.controllers.ConfirmationController;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ConfirmationControllerTest {
    @Mock
    Model model;

    @Autowired
    ConfirmationController confirmationController;

    @Test
    public void testConfirmationPage() {
        assertEquals("confirmation", confirmationController.confirmationPage(model));
    }
}
