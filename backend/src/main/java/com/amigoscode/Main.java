package com.amigoscode;

import com.amigoscode.customer.Customer;
import com.amigoscode.customer.CustomerRepository;
import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Random;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Bean
    CommandLineRunner runner(CustomerRepository customerRepository) {
        return args -> {
            var faker = new Faker();
            var name = faker.name();
            Random random = new Random();
            String firstName = name.firstName();
            String lastName = name.lastName();
            String email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@amigoscode.com";

            Customer customer = new Customer(
                    firstName + " " + lastName,
                    email,
                    random.nextInt(16, 99));


            customerRepository.save(customer);
        };
    }
}
