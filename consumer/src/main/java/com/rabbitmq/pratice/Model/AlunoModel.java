package com.rabbitmq.pratice.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class AlunoModel implements Serializable {
    @JsonProperty("nomeAluno")
    private String nomeAluno;
    @JsonProperty("salaAluno")
    private int salaAluno;
    @JsonProperty("numeroAluno")
    private int numeroAluno;

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public int getSalaAluno() {
        return salaAluno;
    }

    public void setSalaAluno(int salaAluno) {
        this.salaAluno = salaAluno;
    }

    public int getNumeroAluno() {
        return numeroAluno;
    }

    public void setNumeroAluno(int numeroAluno) {
        this.numeroAluno = numeroAluno;
    }
}