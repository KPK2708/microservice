package com.wipro.java.microservice.d;


public class NotificationService {
    private final MessageSender messageSender;

    public NotificationService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void sendNotification(String message) {
        messageSender.sendMessage(message);
    }
}