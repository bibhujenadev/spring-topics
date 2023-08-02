package com.tehcrux.spring.aws.sns.awssns.service;

import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sns.model.PublishRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SNSService {
    public static final String TOPIC_ARN="provide the ARN";
    @Autowired
    private AmazonSNSClient amazonSNSClient;
    public void sendEmail(){
        PublishRequest publishRequest = new PublishRequest(TOPIC_ARN, "Welcome to  Spring boot", "SNS Test email");
        amazonSNSClient.publish(publishRequest);
    }
}
