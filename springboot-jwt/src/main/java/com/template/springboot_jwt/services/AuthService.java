package com.template.springboot_jwt.services;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.template.springboot_jwt.dto.AuthResponse;
import com.template.springboot_jwt.dto.RegisterRequest;
import com.template.springboot_jwt.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public AuthResponse register(RegisterRequest req)
    {
        return AuthResponse.builder().message("User registered successfully!!!").build();
    }
}
