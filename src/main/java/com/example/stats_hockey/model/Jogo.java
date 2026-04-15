package com.example.stats_hockey.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "jogos")
@Getter
@Setter
public class Jogo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeEquipaCasa;
    private String nomeEquipaFora;
    private int golosEquipaCasa;
    private int golosEquipaFora;
    private String resultado;
    private int jornada;

    public Jogo(String nomeEquipaCasa, String nomeEquipaFora, int golosEquipaCasa, int golosEquipaFora, int jornada) {
        this.nomeEquipaCasa = nomeEquipaCasa;
        this.nomeEquipaFora = nomeEquipaFora;
        this.golosEquipaCasa = golosEquipaCasa;
        this.golosEquipaFora = golosEquipaFora;
        this.jornada = jornada;
        this.resultado = golosEquipaCasa + " - " + golosEquipaFora;
    }
}
