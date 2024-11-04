package com.university.user_service.service;

public class CustomerUser implements User {
    @Override
    public void displayRole() {
        System.out.println("I am a Customer user.");
    }
}