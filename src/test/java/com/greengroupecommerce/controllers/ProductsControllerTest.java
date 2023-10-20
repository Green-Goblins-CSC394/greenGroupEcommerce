package com.greengroupecommerce.controllers;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.ui.Model;

import com.greengroupecommerce.controllers.ProductsController;
import com.greengroupecommerce.entities.Category;
import com.greengroupecommerce.entities.Products;
import com.greengroupecommerce.repositories.CategoryRepository;
import com.greengroupecommerce.repositories.ProductsRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.UUID;

@SpringBootTest
public class ProductsControllerTest {

    @Mock
    private Model model;

    @InjectMocks
    private ProductsController productsController;

    @Mock
    private CategoryRepository categoryRepository;

    @Mock
    private ProductsRepository productsRepository;

    @Test
    public void testProductsPage() {
        String productId = "30be9575-bb98-44f1-8d29-c63cab6a4825";
        String categoryName = "Electronics";
        Category category = new Category();
        category.setCategoryName(categoryName);
        when(productsRepository.findByProductID(UUID.fromString(productId))).thenReturn(new Products());

        String viewName = productsController.productPage(productId, model);

        assertEquals("product", viewName);
    }
    
}