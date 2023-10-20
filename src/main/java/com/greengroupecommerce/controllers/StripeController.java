package com.greengroupecommerce.controllers;

import com.stripe.Stripe;
import com.stripe.model.checkout.Session;
import com.stripe.param.checkout.SessionCreateParams;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/call-checkout")
public class StripeController {

    @PostMapping
    public RedirectView createCheckoutSession() throws Exception {

        String YOUR_DOMAIN = "http://green-goblins.us-east-1.elasticbeanstalk.com";
      
        SessionCreateParams params =
                SessionCreateParams.builder()
                        .setMode(SessionCreateParams.Mode.PAYMENT)
                        .setSuccessUrl(YOUR_DOMAIN + "/confirmation")
                        .setCancelUrl(YOUR_DOMAIN + "/home")
                        .addLineItem(
                                SessionCreateParams.LineItem.builder()
                                        .setQuantity(1L)
                                        // Provide the exact Price ID (for example, pr_1234) of the product you want to sell
                                        .setPrice("price_1O2Po6AJzwVAVVDsohgTU5z1")
                                        .build())
                        .build();
        Session session = Session.create(params);

        return new RedirectView(session.getUrl());
    }
}

