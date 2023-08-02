package com.tehcrux.spring.smtp.integration.springemailing.controller;

import com.tehcrux.spring.smtp.integration.springemailing.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
    @Autowired
    private EmailService emailService;
    @PostMapping("/sendEmail")
    public ResponseEntity<String> sendEmail(){
        emailService.sendSimpleMessage("to email id ","testEmail","Welcome Abhishek");
        return  ResponseEntity.ok("Email sent");
    }
}
