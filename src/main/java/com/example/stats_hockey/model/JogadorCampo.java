package com.example.stats_hockey.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JogadorCampo extends Jogador implements IMarcavel {
    private int golos = 0;
    private int assists = 0;
    private int faltas = 0;
    private int remates = 0;

    public JogadorCampo(String nome, int numero, String equipa_nome) {
        super(nome, numero, equipa_nome);
    }

    public String toString() {
        return "[" + super.getEquipa_Nome() + "] " + "[" + super.getNumero() + "] " + super.getNome() + " | " + golos + " | " + assists + " | " + faltas + " | " + remates + " | " + super.getAzuis() + " | " + super.getAmarelos() + " | " + super.getPlusMinus() + " | " + super.getMinutos();
    }

    public void mostrar() {
        System.out.println(toString());
    }

    @Override
    public void registarGolo(int golos) {
        this.golos += golos;
    }

    public void registarAssist(int assists) {
        this.assists += assists;
    }

    public void registarFalta(int faltas) {
        this.faltas += faltas;
    }

    public void registarRemate(int remates) {
        this.remates += remates;
    }
}
