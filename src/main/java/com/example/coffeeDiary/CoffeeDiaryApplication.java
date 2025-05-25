package com.example.coffeeDiary;

import com.example.coffeeDiary.model.Coffee;
import com.example.coffeeDiary.model.Taste;
import com.example.coffeeDiary.model.User;
import com.example.coffeeDiary.repository.CoffeeRepository;
import com.example.coffeeDiary.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CoffeeDiaryApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoffeeDiaryApplication.class, args);
	}

	@Bean
	@Transactional
	public CommandLineRunner run(CoffeeRepository coffeeRepository, UserRepository userRepository) {
		return args -> {
			User user = new User("Jack", "Bauer", "jack@gmail.com", "abcabc");
			userRepository.save(user);
			coffeeRepository.save(new Coffee(user, "Java", "Sweet kick", "Arabica", 10, Taste.sweet));
		};
	}

}
