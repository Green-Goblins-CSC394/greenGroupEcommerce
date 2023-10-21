package com.greengroupecommerce.controllers;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.ui.Model;

import com.greengroupecommerce.controllers.MenController;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class MenControllerTest {
    @Mock
    Model model;

    @Autowired
    MenController menController;

    @Test
    public void testMensPage() {
        assertEquals("men", menController.menPage(model));
    }
}