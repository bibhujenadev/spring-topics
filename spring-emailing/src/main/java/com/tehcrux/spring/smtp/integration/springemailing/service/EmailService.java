package com.tehcrux.spring.smtp.integration.springemailing.service;

public interface EmailService {
    public void sendSimpleMessage(
            String to, String subject, String text);
}
