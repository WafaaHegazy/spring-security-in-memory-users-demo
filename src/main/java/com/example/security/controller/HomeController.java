package com.example.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Wafaa.Hegazy
 */
@RestController public class HomeController {

    @GetMapping("/home") public String home() {
        return "home";
    }
}
