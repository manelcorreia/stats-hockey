package com.example.stats_hockey.model;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class JogadorDuplicadoException extends Exception {
    public JogadorDuplicadoException(String message) {
        super(message);
    }
}
