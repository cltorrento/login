package com.inno.login.security.email;

public interface EmailSender {
    void send(String to, String email);
}
