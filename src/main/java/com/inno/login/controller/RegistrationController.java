package com.inno.login.controller;

import com.inno.login.service.RegistrationRequest;
import com.inno.login.service.RegistrationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/customer")
@AllArgsConstructor
public class RegistrationController {
    private RegistrationService registrationService;

    @PostMapping("/register")
    public String register(@RequestBody RegistrationRequest request){
        return registrationService.register(request);
    }
}
