package com.inno.login.service;

import com.inno.login.model.User;
import com.inno.login.model.UserRole;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistrationService {
    private final EmailValidator emailValidator;
    private final UserService userService;

    public String register(RegistrationRequest request) {
        boolean isValidEmail = emailValidator.test(request.getEmail());
        if(!isValidEmail){
            throw new IllegalStateException("email is not valid");
        }
        return userService.signUpUser(new User(
                request.getFirstName(),
                request.getLastName(),
                request.getEmail(),
                request.getPassword(),
                UserRole.USER
        ));
    }
}
