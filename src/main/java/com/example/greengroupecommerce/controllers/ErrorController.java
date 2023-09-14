package com.example.greengroupecommerce.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ErrorController {
    public ErrorController() {}
        
    @GetMapping("/error")
        public String errorPage(Model model) {
            return "error";
        }

}
