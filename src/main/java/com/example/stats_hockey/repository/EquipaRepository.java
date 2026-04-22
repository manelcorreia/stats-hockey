package com.example.stats_hockey.repository;

import com.example.stats_hockey.model.Equipa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EquipaRepository extends JpaRepository<Equipa, String> {
    List<Equipa> findAllByOrderByPontosDesc();
    List<Equipa> findAllByOrderByGolosMarcadosDesc();
    List<Equipa> findAllByOrderGolosSofridosDesc();
}
