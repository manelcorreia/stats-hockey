package com.example.stats_hockey.model;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NaoExisteEquipaException extends Exception {
    public NaoExisteEquipaException(String message) {
        super(message);
    }
}
