package com.dest1.Filme.entities.controllers;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Filme {

    @Id
    private int id;
    private String nome;
    private String genero;
    private String diretor;
    private int anoLancamento;
    private String imagem;
    private String descricao;

    public Filme(String nome, String genero, String diretor, int anoLancamento, String imagem, String descricao) {
        this.nome = nome;
        this.genero = genero;
        this.diretor = diretor;
        this.anoLancamento = anoLancamento;
        this.imagem = imagem;
        this.descricao = descricao;
    }

    public Filme() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

