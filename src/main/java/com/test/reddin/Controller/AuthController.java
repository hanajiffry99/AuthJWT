package com.test.reddin.Controller;

import com.test.reddin.DTO.RegisterRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")

public class AuthController {
    @PostMapping("/register")
    public void register(@RequestBody RegisterRequest registerRequest)
}
