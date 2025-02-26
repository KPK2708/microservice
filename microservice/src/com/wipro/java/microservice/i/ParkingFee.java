package com.wipro.java.microservice.i;

public interface ParkingFee {
    double calculateFee(Car car, int hours);
    void processPayment(Car car, double amount);
}