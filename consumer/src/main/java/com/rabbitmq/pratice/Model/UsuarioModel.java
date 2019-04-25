package com.rabbitmq.pratice.Model;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class UsuarioModel implements Serializable {
    @JsonProperty("nome")
    private String nome;
    @JsonProperty("idade")
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