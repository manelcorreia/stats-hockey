package com.example.stats_hockey.service;

import com.example.stats_hockey.model.Equipa;
import com.example.stats_hockey.model.EquipaDuplicadaException;
import com.example.stats_hockey.model.NaoExisteEquipaException;
import com.example.stats_hockey.repository.EquipaRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Slf4j
@Service
public class EquipaService {
    private final EquipaRepository equipaRepository;

    public void adicionarEquipa(Equipa equipa) {
        if (equipaRepository.existsById(equipa.getNome())) {
            log.warn("Tentativa de criar equipa duplicada: {}", equipa.getNome());
            throw new EquipaDuplicadaException("Erro: Tentativa de criar equipa duplicada.");
        }
        equipaRepository.save(equipa);
        log.info("Equipa '{}' guardada com sucesso na base de dados.", equipa.getNome());
    }

    public List<Equipa> listarTodas() {
        log.info("A carregar a lista de equipas da base de dados...");
        return equipaRepository.findAll();
    }

    public void removerEquipa(String nome) {
        if (equipaRepository.existsById(nome)) {
            equipaRepository.deleteById(nome);
            log.info("Equipa '{}' removida com sucesso.", nome);
        } else {
            log.error("Falha ao remover: Equipa '{}' não encontrada.", nome);
            throw new NaoExisteEquipaException("Erro: Não existe equipa com esses dados.");
        }
    }

    public Equipa procurarEquipa(String nomeEquipa) {
        return equipaRepository.findById(nomeEquipa)
                .orElseThrow(() -> new NaoExisteEquipaException("Erro: não existe equipa com esse nome."));
    }

    public List<Equipa> verClassificacao() {
        return equipaRepository.findAllByOrderByPontosDesc();
    }

    public List<Equipa> classificacaoPorGolosMarcados() {
        return equipaRepository.findAllByOrderByGolosMarcadosDesc();
    }

    public List<Equipa> classificacaoGolosSofridos() {
        return equipaRepository.findAllByOrderGolosSofridosDesc();
    }
}
