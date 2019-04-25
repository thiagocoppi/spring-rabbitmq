package com.rabbitmq.pratice.Model;

public class UsuarioEntrada {
    public String nome;
    public String idades;
    public String email;
    public String senha;
    public String logradouro;

    public UsuarioEntrada(String nome, String idades, String email, String senha, String logradouro) {
        this.nome = nome;
        this.idades = idades;
        this.email = email;
        this.senha = senha;
        this.logradouro = logradouro;
    }

    public String getIdades() {
        return idades;
    }

    public void setIdades(String idades) {
        this.idades = idades;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idades;
    }

    public void setIdade(String idades) {
        this.idades = idades;
    }
}
