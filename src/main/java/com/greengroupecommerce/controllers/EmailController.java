package com.greengroupecommerce.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greengroupecommerce.services.EmailConfirmationService;
import com.greengroupecommerce.services.SimpleEmail;

@RestController
public class EmailController {

    @Autowired
    private EmailConfirmationService emailConfirmationService;

    @Autowired 
    private SimpleEmail simpleEmail;

    // Templated Email Request; not working right now
    @GetMapping("/sendConfirmationEmail")
    public String sendTemplatedMessage() {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("jakemopie9@gmail.com");
        simpleMailMessage.setTo("jakemopie9@gmail.com");
        emailConfirmationService.sendTemplatedMessage(simpleMailMessage);

        return "Email sent successfully";
    }
    

    @GetMapping("/simpleEmail")
    public String sendMessage() {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("jakemopie9@gmail.com");
        simpleMailMessage.setTo("jakemopie9@gmail.com");
        simpleMailMessage.setSubject("Order Confirmation");
        simpleMailMessage.setText("Hi customer,\n\nThanks for your order! Your brand new t-shirt will arrive in 3-5 business days!\n\nThanks for your support!\nThe Green Goblins Team");
        simpleEmail.sendMessage(simpleMailMessage);

        return "Email sent successfully";
    }
}
