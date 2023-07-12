package com.order.order.controller;

import com.order.order.entity.AuthenticationRequest;
import com.order.order.entity.AuthenticationResponse;
import com.order.order.entity.RegisterRequest;
import com.order.order.entity.User;
import com.order.order.auth.AuthenticationService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/auth")
@Tag(name = "User Registration & Authentication")
public class AuthenticationController {
    private AuthenticationService service;

    @Autowired
    public AuthenticationController(AuthenticationService authenticationService) {
        service = authenticationService;
    }

    @PostMapping("/register")
    public ResponseEntity<String> register (@RequestBody RegisterRequest request) {
        return ResponseEntity.ok(service.register(request));
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate (@RequestBody AuthenticationRequest request) {
        return ResponseEntity.ok(service.authenticate(request));
    }
}