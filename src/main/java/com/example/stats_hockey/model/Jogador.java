package com.example.stats_hockey.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_jogador")
@Getter
@Setter
public abstract class Jogador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private int numero;
    private int azuis = 0;
    private int amarelos = 0;
    private int plusMinus = 0;
    private int minutos = 0;
    private int titular = 0;
    private String equipa_nome;

    public Jogador(String nome, int numero, String equipa_nome) {
        this.nome = nome;
        this.numero = numero;
        this.equipa_nome = equipa_nome;
    }

    public String getEquipa_Nome() {
        return equipa_nome;
    }

    public void registarAzul(int azuis) {
        this.azuis += azuis;
    }

    public void registarAmarelo(int amarelos) {
        this.amarelos += amarelos;
    }

    public void atualizarMaisMenosGoloMarcado(int quantidade) {
        this.plusMinus += quantidade;
    }

    public void atualizarMaisMenosGoloSofrido(int quantidade) {
        this.plusMinus -= quantidade;
    }

    public void atualizarNumeroTitular(int quantidade) {
        if (quantidade == 1 || quantidade == 0) {
            this.titular += quantidade;
        }
    }

    public void atualizarMinutos(int minutosDados) {
        this.minutos += minutosDados;
    }
}
