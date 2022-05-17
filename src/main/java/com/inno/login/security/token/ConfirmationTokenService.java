package com.inno.login.security.token;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ConfirmationTokenService {
    private final ConfirmationTokenRepository confirmationTokenRepository;

    public void SaveConfirmationToken(ConfirmationToken token){
        confirmationTokenRepository.save(token);
    }
}