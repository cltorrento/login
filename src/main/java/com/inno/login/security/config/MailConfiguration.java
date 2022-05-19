package com.inno.login.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;


@Configuration
public class MailConfiguration {

    @Bean
    public JavaMailSender javaMailSender() {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        //Properties mailProperties = new Properties();
        //mailProperties.put("mail.smtp.auth", false);
        //mailProperties.put("mail.smtp.starttls.enable", false);
        //mailSender.setJavaMailProperties(mailProperties);
        mailSender.setHost("localhost");
        mailSender.setPort(25);
        mailSender.setProtocol("smtp");
        mailSender.setUsername("hello");
        mailSender.setPassword("hello");
        return mailSender;
    }
}
