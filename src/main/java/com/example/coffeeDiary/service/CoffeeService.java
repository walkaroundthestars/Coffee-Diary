package com.example.coffeeDiary.service;

import com.example.coffeeDiary.model.Coffee;
import com.example.coffeeDiary.repository.CoffeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CoffeeService {
    @Autowired
    private CoffeeRepository coffeeRepository;

    public List<Coffee> getAllCoffees() {
        return coffeeRepository.findAll();
    }

    public List<Coffee> getCoffeeByUserId(int id) {
        return coffeeRepository.findAllByUserId(id);
    }

    public Coffee addCoffee(Coffee coffee) {
        return coffeeRepository.save(coffee);
    }

    public void deleteCoffee(Coffee coffee) {
        coffeeRepository.delete(coffee);
    }
}
