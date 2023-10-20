package com.greengroupecommerce;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.ui.Model;

import com.greengroupecommerce.controllers.WomenController;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class WomenControllerTest {
    @Mock
    Model model;

    @Autowired
    WomenController womenController;

    @Test
    public void testMensPage() {
        assertEquals("women", womenController.womenPage(model));
    }
}
