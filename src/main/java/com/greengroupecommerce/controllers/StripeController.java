package com.greengroupecommerce.controllers;

import com.greengroupecommerce.entities.Cart;
import com.greengroupecommerce.entities.Users;
import com.greengroupecommerce.repositories.UsersRepository;
import com.stripe.model.checkout.Session;
import com.stripe.param.checkout.SessionCreateParams;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

import com.stripe.Stripe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/call-checkout")
public class StripeController {

    @Value("${stripe.api.secretKey}")
    private String apiKey;

    @Value("${greengoblins.url}")
    private String domainURL;
  
    @Autowired
    private UsersRepository userRepository;

    @PostMapping
    public RedirectView createCheckoutSession(Principal principal, Model model) throws Exception {

        Stripe.apiKey = apiKey;

        Users user = this.userRepository.findByEmail(principal.getName());
        List<Cart> cartItems = user.getCartItems();

        List<SessionCreateParams.LineItem> lineItems = new ArrayList<>();

        for (Cart item : cartItems) {
            SessionCreateParams.LineItem lineItem = 
            SessionCreateParams.LineItem.builder()
                .setQuantity(Long.valueOf(item.getQuantity()))
                .setPriceData(SessionCreateParams.LineItem.PriceData.builder()
                        .setCurrency("usd")
                        .setProduct(item.getProduct().getStripeProductId())
                        .setUnitAmount(Long.valueOf(item.getProduct().getPrice().longValue()) * 100) // Stripe expects the amount in cents
                        .build())
                .build();
            lineItems.add(lineItem);
        }

        String YOUR_DOMAIN = this.domainURL;
      
        SessionCreateParams params =
                SessionCreateParams.builder()
                        .setMode(SessionCreateParams.Mode.PAYMENT)
                        .setSuccessUrl(YOUR_DOMAIN + "/confirmation")
                        .setCancelUrl(YOUR_DOMAIN + "/home")
                        .addAllLineItem(lineItems)
                        .build();
        Session session = Session.create(params);

        return new RedirectView(session.getUrl());
    }

}
