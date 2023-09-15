package com.example.greengroupecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class GreenGroupEcommerce {

    public static void main(String[] args) {

        SpringApplication.run(GreenGroupEcommerce.class, args);

    }
}
