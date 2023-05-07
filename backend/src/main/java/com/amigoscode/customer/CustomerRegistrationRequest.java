package com.amigoscode.customer;

public record CustomerRegistrationRequest(
        String name,
        String email,
        String password, Gender gender, Integer age
) {
}
