package com.greengroupecommerce.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.model.Destination;
import com.amazonaws.services.simpleemail.model.SendTemplatedEmailRequest;

@Service
public class EmailConfirmationService {
    
    @Autowired
    private MailSender mailSender;

    @Autowired
    private AmazonSimpleEmailService simpleEmailService;

    public void sendMessage(SimpleMailMessage simpleMailMessage) {
        this.mailSender.send(simpleMailMessage);
    }

    public void sendTemplatedMessage(SimpleMailMessage simpleMailMessage) {

        Destination destination = new Destination();
        List<String> toAddresses = new ArrayList<>();
        String[] emails = new String[]{"jakeopie9@gmail.com"};
        Collections.addAll(toAddresses, Objects.requireNonNull(emails));
        destination.setToAddresses(toAddresses);

        SendTemplatedEmailRequest templatedEmailRequest = new SendTemplatedEmailRequest();
        templatedEmailRequest.withDestination(destination);
        templatedEmailRequest.withTemplate("GoblinTemplate");
        templatedEmailRequest.withTemplateData("{ \"name\":\"Jake Test\", \"order_id\": \"1337\"}");
        templatedEmailRequest.withSource("jakemopie9@gmail.com");
        simpleEmailService.sendTemplatedEmail(templatedEmailRequest);
    }
}
