package com.example.stats_hockey.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GuardaRedes extends Jogador implements ISofrivel {
    private int defesas = 0;
    private int golosSofridos = 0;
    private int bolasParadasDefendidas = 0;
    private int bolasParadasSofridas = 0;

    public GuardaRedes(String nome, int numero, String equipa_nome) {
        super(nome, numero, equipa_nome);
    }

    public int getDefesas() {
        return defesas;
    }

    public int getGolosSofridos() {
        return golosSofridos;
    }

    public int getBolasParadasDefendidas() {
        return bolasParadasDefendidas;
    }

    public int getBolasParadasSofridas() {
        return bolasParadasSofridas;
    }

    @Override
    public void registarGoloSofrido(int quantidade) {
        golosSofridos += quantidade;
    }

    public void registarDefesa(int quantidade) {
        defesas += quantidade;
    }

    public void registarBolaParadaDefendida(int quantidade) {
        bolasParadasDefendidas += quantidade;
    }

    public void registarBolaParadaSofrida(int quantidade) {
        bolasParadasSofridas += quantidade;
    }
}
