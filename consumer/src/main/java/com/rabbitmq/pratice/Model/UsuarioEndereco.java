package com.rabbitmq.pratice.Model;

public class UsuarioEndereco {

    public String email;
    public String senha;
    public String logradouro;


    public UsuarioEndereco(String email, String senha, String logradouro) {
        this.email = email;
        this.senha = senha;
        this.logradouro = logradouro;
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
}
