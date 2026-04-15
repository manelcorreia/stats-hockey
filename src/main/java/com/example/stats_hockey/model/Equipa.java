package com.example.stats_hockey.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Entity
@Getter
@Setter
public class Equipa implements IMarcavel, ISofrivel {
    @Id
    private String nome;
    private ArrayList<Jogador> jogadores = new ArrayList<>();
    private int numeroJogadores = 10;
    private int pontos = 0;
    private int golosMarcados = 0;
    private int golosSofridos = 0;
    private int vitorias = 0;
    private int empates = 0;
    private int derrotas = 0;

    public Equipa(String nome) {
        this.nome = nome;
    }

    public void definirResultado(int golosMarcadosJogo, int golosSofridosJogo) {
        if (golosMarcadosJogo > golosSofridosJogo) {
            registarVitoria();
        } else if (golosMarcadosJogo == golosSofridosJogo) {
            registarEmpate();
        } else {
            registarDerrota();
        }
        golosMarcados += golosMarcadosJogo;
        golosSofridos += golosSofridosJogo;
    }

    @Override
    public void registarGolo(int golosMarcados) {
        this.golosMarcados++;
    }

    @Override
    public void registarGoloSofrido(int golosSofridos) {
        this.golosSofridos++;
    }

    public void registarVitoria() {
        this.vitorias++;
        this.pontos += 3;
    }

    public void registarEmpate() {
        this.empates++;
        this.pontos += 1;
    }

    public void registarDerrota() {
        this.derrotas++;
    }

    public void adicionarJogador(Jogador novoJogador) {
        jogadores.add(novoJogador);
        System.out.println("main.Jogador adicionada à equipa " + getNome());
    }
}
