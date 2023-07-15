package com.tehcrux.spring.aws.sns.awssns.controller;

import com.tehcrux.spring.aws.sns.awssns.service.SNSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SNSController {
    @Autowired
    private SNSService snsService;
    @PostMapping("/sendEmail")
    public ResponseEntity<String> sendEmail(){
        snsService.sendEmail();
        return  ResponseEntity.ok("Successfully email sent");
    }
}
