package com.example.greengroupecommerce;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HelloWorldController {
    private static final String base = "Hello %s";

    @GetMapping("/hi")
    public String greeting(@RequestParam(value = "name", defaultValue = "world") String name) {
        return String.format(base, name);
    }
}
