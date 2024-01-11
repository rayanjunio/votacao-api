package com.votacao.melhordomundo.melhordomundo.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "jogadores")
public class Jogador {

    //ATRIBUTOS
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int credencial;

    @Column(nullable = false, length = 50)
    private String nome;

    @Column(nullable = false)
    private int numeroDaCamisa;

    @Column(nullable = false)
    private int golsNaTemporada;

    @Column(nullable = false)
    private int assistenciasNaTemporada;

    @Column(nullable = false)
    private int numeroDeJogos;


    @Column
    private int idade;

    @Column
    private int votos = 0;

    //GETTERS E SETTERS
    public int getCredencial() {
        return credencial;
    }

    public void setCredencial(int credencial) {
        this.credencial = credencial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroDaCamisa() {
        return numeroDaCamisa;
    }

    public void setNumeroDaCamisa(int numeroDaCamisa) {
        this.numeroDaCamisa = numeroDaCamisa;
    }

    public int getGolsNaTemporada() {
        return golsNaTemporada;
    }

    public void setGolsNaTemporada(int golsNaTemporada) {
        this.golsNaTemporada = golsNaTemporada;
    }

    public int getAssistenciasNaTemporada() {
        return assistenciasNaTemporada;
    }

    public void setAssistenciasNaTemporada(int assistenciasNaTemporada) {
        this.assistenciasNaTemporada = assistenciasNaTemporada;
    }

    public int getNumeroDeJogos() {
        return numeroDeJogos;
    }

    public void setNumeroDeJogos(int numeroDeJogos) {
        this.numeroDeJogos = numeroDeJogos;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
