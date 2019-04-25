package com.rabbitmq.example;

import java.io.Serializable;

public class UsuarioModel implements Serializable {

    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Usuario [nome=" + this.nome + ",idade=["+this.idade+"]";
    }
}
