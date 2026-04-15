package com.example.stats_hockey.controller;

import com.example.stats_hockey.model.Jogo;
import com.example.stats_hockey.service.JogoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jogos")
public class JogoController {
    private final JogoService jogoService;

    public JogoController(JogoService jogoService) {
        this.jogoService = jogoService;
    }

    @GetMapping("/todos")
    public List<Jogo> listarTodos() {
        return jogoService.listarTodos();
    }

    @PostMapping
    public void salvarJogo(@RequestBody Jogo j) {
        jogoService.salvarJogo(j);
    }
}
