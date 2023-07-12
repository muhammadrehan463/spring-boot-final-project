package com.RiderRegistration.RiderRegistration.controller;

import com.RiderRegistration.RiderRegistration.entity.AuthenticationRequest;
import com.RiderRegistration.RiderRegistration.entity.AuthenticationResponse;
import com.RiderRegistration.RiderRegistration.entity.RegisterRequest;
import com.RiderRegistration.RiderRegistration.entity.User;
import com.RiderRegistration.RiderRegistration.auth.AuthenticationService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
@SecurityRequirement(name = "")
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