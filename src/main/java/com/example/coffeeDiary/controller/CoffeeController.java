package com.example.coffeeDiary.controller;

import com.example.coffeeDiary.model.Coffee;
import com.example.coffeeDiary.service.CoffeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class CoffeeController {
    @Autowired
    private CoffeeService coffeeService;

    @GetMapping("/coffee")
    public List<Coffee> getAllCoffees() {
        return coffeeService.getAllCoffees();
    }

    @GetMapping("/coffees/{id}")
    public List<Coffee> getCoffeeByUserId(@PathVariable int id) {
        return coffeeService.getCoffeeByUserId(id);
    }
}
