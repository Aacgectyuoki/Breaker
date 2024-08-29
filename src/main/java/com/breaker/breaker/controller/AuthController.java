package com.breaker.breaker.controller;

import com.breaker.breaker.config.JwtUtils;
import com.breaker.breaker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private JwtUtils jwtUtils;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestParam String username, @RequestParam String password) {
        // Simulate user authentication
        if ("user".equals(username) && "password".equals(password)) {
            // Generate JWT token
            String token = jwtUtils.generateToken(username);
            return ResponseEntity.ok("Bearer " + token);
        } else {
            return ResponseEntity.status(401).body("Invalid credentials");
        }
    }
}


