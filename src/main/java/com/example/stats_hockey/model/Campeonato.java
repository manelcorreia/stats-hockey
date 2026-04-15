package com.example.stats_hockey.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class Campeonato {
    private ArrayList<Equipa> equipas = new ArrayList<>();
    private ArrayList<Jornada> jornadas = new ArrayList<>();

    public void adicionarEquipa(Equipa novaEquipa) {
        equipas.add(novaEquipa);
        System.out.println("Equipa adicionada com sucesso ao campeonato.");
    }

    public void adicionarJornada(Jornada novaJornada) {
        jornadas.add(novaJornada);
        System.out.println("Jornada adicionada com sucesso ao campeonato.");
    }
}
