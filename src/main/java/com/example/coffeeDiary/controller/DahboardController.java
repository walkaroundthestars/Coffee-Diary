package com.example.coffeeDiary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class DahboardController {

    @GetMapping("/dashboard")
    public String showDashboard(Model model) {
        return "dashboard";
    }
}
