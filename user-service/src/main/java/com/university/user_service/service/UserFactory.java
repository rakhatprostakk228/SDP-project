package com.university.user_service.service;

public class UserFactory {

    public static User createUser(String userType) {
        switch (userType) {
            case "admin":
                return new AdminUser();
            case "customer":
                return new CustomerUser();
            default:
                throw new IllegalArgumentException("Unknown user type: " + userType);
        }
    }
}