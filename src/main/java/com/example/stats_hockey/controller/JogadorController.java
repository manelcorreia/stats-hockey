package com.example.stats_hockey.controller;

import com.example.stats_hockey.model.Jogador;
import com.example.stats_hockey.service.JogadorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jogadores")
public class JogadorController {
    private final JogadorService jogadorService;

    public JogadorController(JogadorService jogadorService) {
        this.jogadorService = jogadorService;
    }

    @GetMapping("/todos")
    public List<Jogador> listarTodos() {
        return jogadorService.listarTodos();
    }

    @PostMapping
    public void adicionarJogador(@RequestBody Jogador j) {
        jogadorService.adicionarJogador(j);
    }

    @DeleteMapping("/{id}")
    public void removerJogador(@PathVariable Long id) {
        jogadorService.removerJogador(id);
    }
}
