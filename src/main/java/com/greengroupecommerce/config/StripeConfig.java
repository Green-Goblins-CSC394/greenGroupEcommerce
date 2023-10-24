package com.greengroupecommerce.config;

import com.stripe.Stripe;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StripeConfig {
    @Value("${STRIPE_TEST_PRIVATE_KEY}")
    private String secretKey;

    @PostConstruct
    public void initSecretKey(){
        Stripe.apiKey = secretKey;
    }
}
