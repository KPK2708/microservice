package com.wipro.java.microservice.d;

public class SmsSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("SMS Sent: " + message);
    }
}