package com.example.coffeeDiary.repository;

import com.example.coffeeDiary.model.Coffee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoffeeRepository extends JpaRepository<Coffee, Long> {
    public List<Coffee> findAllByUserId(int id);
}
