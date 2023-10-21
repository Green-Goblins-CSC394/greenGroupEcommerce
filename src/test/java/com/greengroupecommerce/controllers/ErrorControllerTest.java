package com.greengroupecommerce.controllers;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.ui.Model;

import com.greengroupecommerce.controllers.ErrorController;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ErrorControllerTest {
    @Mock
    Model model;

    @Autowired
    ErrorController errorController;

    @Test
    public void testErrorPage() {
        assertEquals("error", errorController.errorPage(model));
    }
}
