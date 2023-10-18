package com.greengroupecommerce.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.greengroupecommerce.entities.Orders;
import com.greengroupecommerce.services.EmailConfirmationService;

@RestController
public class EmailController {

    @Autowired
    private EmailConfirmationService emailConfirmationService;

    @PostMapping("/sendConfirmationEmail")
    public String sendTemplatedMessage(@RequestBody Orders orderDetails) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("jakemopie9@gmail.com");
        simpleMailMessage.setTo("jakeopie9@gmail.com");
        emailConfirmationService.sendTemplatedMessage(simpleMailMessage);

        return "Email sent successfully";
    }
}
