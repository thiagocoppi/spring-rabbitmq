package com.rabbitmq.example;

import java.io.Serializable;

public class AlunoModel implements Serializable {
    private String nomeAluno;
    private int salaAluno;
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
