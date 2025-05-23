package com.example.aitimetraveler.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
  
    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("name", "Baby Girl");
        return "index";  // this will render index.html from templates folder
    }
}
