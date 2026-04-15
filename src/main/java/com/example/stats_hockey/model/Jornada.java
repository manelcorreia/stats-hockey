package com.example.stats_hockey.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class Jornada {
    private ArrayList<Jogo> jogos = new ArrayList<>();
    private String dataJornada;
    private int numeroJornada;

    public Jornada(String dataJornada, int numeroJornada) {
        this.dataJornada = dataJornada;
        this.numeroJornada = numeroJornada;
    }

    public String getDataJornada() {
        return dataJornada;
    }

    public int getNumeroJornada() {
        return numeroJornada;
    }

    public ArrayList<Jogo> getJogos() {
        return jogos;
    }

    public void adicionarJogo(Jogo novoJogo) {
        jogos.add(novoJogo);
        System.out.println("Jogo adicionado à jornada" + getNumeroJornada());
    }
}

