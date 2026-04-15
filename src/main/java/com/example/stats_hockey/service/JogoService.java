package com.example.stats_hockey.service;

import com.example.stats_hockey.model.Jogo;
import com.example.stats_hockey.repository.JogoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class JogoService {
    private final JogoRepository jogoRepository;

    public JogoService(JogoRepository jogoRepository) {
        this.jogoRepository = jogoRepository;
    }

    public void salvarJogo(Jogo jogo) {
        jogoRepository.save(jogo);
        log.info("Jogo entre {} e {} guardado na jornada {}", jogo.getNomeEquipaCasa(), jogo.getNomeEquipaFora(), jogo.getJornada());
    }

    public List<Jogo> listarTodos() {
        return jogoRepository.findAll();
    }
}
