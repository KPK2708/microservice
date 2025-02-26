package com.wipro.java.microservice.o;

public class DatabasePersistence implements BookPersistence {
    @Override
    public void save(Books book) {
        System.out.println("Saving book to Database: " + book.getName());
    }
}