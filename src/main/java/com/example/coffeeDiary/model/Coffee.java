package com.example.coffeeDiary.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
public class Coffee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String brand;
    private String name;
    private String type;
    private int rating;
    private Taste taste;
    private Method method;
    private String description;
    private LocalDateTime createdAt;

    @PrePersist
    public void prePersist() {
        this.createdAt = LocalDateTime.now();
    }

    public Coffee() {
    }

    public Coffee(User user, String brand, String name, String type, int rating, Taste taste) {
        this.user = user;
        this.brand = brand;
        this.name = name;
        this.type = type;
        this.rating = rating;
        this.taste = taste;
    }
}
