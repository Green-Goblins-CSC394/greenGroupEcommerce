package com.greengroupecommerce.controllers;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.ui.Model;

import com.greengroupecommerce.controllers.KidsController;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class KidsControllerTest {
    @Mock
    Model model;

    @Autowired
    KidsController kidsController;

    @Test
    public void testKidsPage() {
        assertEquals("kids", kidsController.kidPage(model));
    }
}