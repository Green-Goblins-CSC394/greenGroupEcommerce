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
import com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClientBuilder;
import com.amazonaws.services.simpleemail.model.Content;
import com.amazonaws.services.simpleemail.model.Body;
import com.amazonaws.services.simpleemail.model.Destination;
import com.amazonaws.services.simpleemail.model.Message;
import com.amazonaws.services.simpleemail.model.Destination;
import com.amazonaws.services.simpleemail.model.SendEmailRequest;
import com.amazonaws.services.simpleemail.model.SendEmailRequest;
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
        /*
        Destination destination = new Destination();
        List<String> toAddresses = new ArrayList<>();
        String[] emails = new String[]{"jakemopie9@gmail.com"};
        Collections.addAll(toAddresses, Objects.requireNonNull(emails));
        destination.setToAddresses(toAddresses);
        */
        SendTemplatedEmailRequest templatedEmailRequest = new SendTemplatedEmailRequest();
        //templatedEmailRequest.withDestination(destination);
        templatedEmailRequest.withTemplate("GoblinTemplate");
        templatedEmailRequest.withTemplateData("{ \"name\":\"Jake Test\", \"order_id\": \"1337\"}");
        templatedEmailRequest.withSource("jakemopie9@gmail.com");
        simpleEmailService.sendTemplatedEmail(templatedEmailRequest);
    }

    public String testSend() {
        try {
            AmazonSimpleEmailService client = AmazonSimpleEmailServiceClientBuilder.defaultClient();

            SendEmailRequest request = new SendEmailRequest()
                    .withDestination(
                            new Destination().withToAddresses("jakemopie9@gmail.com"))
                    .withMessage(new Message()
                            .withBody(new Body()
                                    .withText(new Content()
                                            .withCharset("UTF-8").withData("Hello, this is a test email from AWS SES.")))
                            .withSubject(new Content()
                                    .withCharset("UTF-8").withData("Test email")))
                    .withSource("jakemopie9@gmail.com");

            client.sendEmail(request);
            return "Email sent!";
        } catch (Exception ex) {
            return "The email was not sent. Error message: " + ex.getMessage();
        }
    }
}
