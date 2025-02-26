package com.wipro.java.microservice.o;

public class NewYearDiscount implements Discount {
    @Override
    public double applyDiscount(Book book) {
        return book.getPrice() * 0.1; // 10% discount
    }
}