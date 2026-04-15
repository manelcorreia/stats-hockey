package com.example.stats_hockey.service;

import com.example.stats_hockey.model.*;
import com.example.stats_hockey.repository.JogadorRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class JogadorService {
    private final JogadorRepository jogadorRepository;

    public JogadorService(JogadorRepository jogadorRepository) {
        this.jogadorRepository = jogadorRepository;
    }

    public void adicionarJogador(Jogador j) {
        if (jogadorRepository.existsById(j.getId())) {
            log.warn("Tentativa de criar jogador duplicado.");
            return;
        }
        jogadorRepository.save(j);
        log.info("Jogador {} adicionado à equipa {} com sucesso", j.getNome(), j.getEquipa_Nome());
    }

    public List<Jogador> listarTodos() {
        log.info("A carregar a lista de jogadores da base de dados...");
        return jogadorRepository.findAll();
    }

    public void removerJogador(Long id) {
        if (jogadorRepository.existsById(id)) {
            log.info("A remover jogador...");
            jogadorRepository.deleteById(id);
        } else {
            log.error("Erro: Não foi encontrado nenhum jogador com esse id.");
        }
    }
}
