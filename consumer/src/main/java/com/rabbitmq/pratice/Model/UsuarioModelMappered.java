package com.rabbitmq.pratice.Model;

public class UsuarioModelMappered {
    public String nome;
    public String idades;
    public UsuarioEndereco usuarioEndereco;

    public UsuarioModelMappered(String nome, String idades, UsuarioEndereco usuarioEndereco) {
        this.nome = nome;
        this.idades = idades;
        this.usuarioEndereco = usuarioEndereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdades() {
        return idades;
    }

    public void setIdades(String idades) {
        this.idades = idades;
    }

    public UsuarioEndereco getUsuarioEndereco() {
        return usuarioEndereco;
    }

    public void setUsuarioEndereco(UsuarioEndereco usuarioEndereco) {
        this.usuarioEndereco = usuarioEndereco;
    }
}
