package com.example.stats_hockey.controller;

import com.example.stats_hockey.model.Jogador;
import com.example.stats_hockey.model.JogadorDuplicadoException;
import com.example.stats_hockey.model.NaoExisteJogadorException;
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
    public void adicionarJogador(@RequestBody Jogador j) throws JogadorDuplicadoException {
        jogadorService.adicionarJogador(j);
    }

    @DeleteMapping("/{id}-apagar")
    public void removerJogador(@PathVariable Long id) throws NaoExisteJogadorException {
        jogadorService.removerJogador(id);
    }

    @GetMapping("/{id}")
    public Jogador procurarJogador(@PathVariable Long id) {
        return jogadorService.procurarJogador(id);
    }

    @GetMapping("/{equipaNome}/jogadores")
    public List<Jogador> procurarJogadores(@PathVariable String equipaNome) {
        return jogadorService.procurarJogadoresEquipa(equipaNome);
    }

    @GetMapping("/lista-melhores-marcadores")
    public List<Jogador> listaMelhoresMarcadores() {
        return jogadorService.melhoresMarcadores();
    }

    @GetMapping("/lista-melhores-assistentes")
    public List<Jogador> listaMelhoresAssistentes() {
        return jogadorService.melhoresAssistentes();
    }
}
