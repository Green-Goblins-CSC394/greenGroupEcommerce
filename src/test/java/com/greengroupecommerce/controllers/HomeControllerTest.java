package com.greengroupecommerce.controllers;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.ui.Model;

import com.greengroupecommerce.controllers.HomeController;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class HomeControllerTest {
    @Mock
    Model model;

    @Autowired
    HomeController homeController;

    @Test
    public void testHomePage() {
        assertEquals("home", homeController.homePage(model));
    }
}
