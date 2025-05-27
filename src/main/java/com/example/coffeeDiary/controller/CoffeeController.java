package com.example.coffeeDiary.controller;

import com.example.coffeeDiary.model.Coffee;
import com.example.coffeeDiary.service.CoffeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/main")
public class CoffeeController {
    @Autowired
    private CoffeeService coffeeService;

    @GetMapping("/coffee")
    public List<Coffee> getAllCoffees() {
        return coffeeService.getAllCoffees();
    }

    @GetMapping("/coffees/{id}")
    public List<Coffee> getCoffeesByUserId(@PathVariable int id) {
        return coffeeService.getCoffeeByUserId(id);
    }

    @GetMapping("/coffee/add")
    public String addCoffee() {
        return "addCoffee";
    }

    @PostMapping("/coffee/add")
    public Coffee addCoffee(@RequestBody Coffee coffee) {
        return coffeeService.addCoffee(coffee);
    }

    @DeleteMapping("/coffee/delete")
    public void deleteCoffee(@RequestBody Coffee coffee) {
        coffeeService.deleteCoffee(coffee);
    }
}
