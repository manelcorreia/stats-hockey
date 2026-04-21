package com.example.stats_hockey.repository;

import com.example.stats_hockey.model.Jogador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JogadorRepository extends JpaRepository<Jogador, Long> {
    List<Jogador> findByEquipaNome(String equipaNome);
}
