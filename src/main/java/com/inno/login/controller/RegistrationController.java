package com.inno.login.controller;

import com.inno.login.service.RegistrationRequest;
import com.inno.login.service.RegistrationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/v1/customer")
@AllArgsConstructor
public class RegistrationController {
    private final RegistrationService registrationService;

    @PostMapping
    public String register(@RequestBody RegistrationRequest request){
        return registrationService.register(request);
    }

    @GetMapping(path = "confirm")
    public String confim(@RequestParam("token") String token){
        return registrationService.confirmToken(token);
    }
}
