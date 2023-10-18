package com.greengroupecommerce.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.MailSender;
import org.springframework.mail.javamail.JavaMailSender;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClientBuilder;

import io.awspring.cloud.ses.SimpleEmailServiceJavaMailSender;
import io.awspring.cloud.ses.SimpleEmailServiceMailSender;

@Configuration
public class EmailConfig {

    @Value("${cloud.aws.credentials.access-key}")
    private String accessKey;

    @Value("${cloud.aws.credentials.secret-key}")
    private String secretKey;

    @Value("${cloud.aws.region.static}")
    private String region;

    @Bean
    public AmazonSimpleEmailService amazonSimpleEmailService() {
        BasicAWSCredentials credentials = new BasicAWSCredentials("AKIAVFE43N4HPR7NJO6H", "9uloBM4BxCUkH2o3yh3oAW52kS2nqe14PCkn1EEI");
        return AmazonSimpleEmailServiceClientBuilder.standard()
                .withCredentials(new AWSStaticCredentialsProvider(credentials))
                .withRegion("us-east-1")
                .build();
    }

    @Bean
    public MailSender mailSender(AmazonSimpleEmailService amazonSimpleEmailService) {
        return new SimpleEmailServiceMailSender(amazonSimpleEmailService);
    }
/* 
    @Bean
    public JavaMailSender javaMailSender(AmazonSimpleEmailService amazonSimpleEmailService) {
        return new SimpleEmailServiceJavaMailSender(amazonSimpleEmailService);
    }*/
}
