package com.bootcamp.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data;

    public Mentoria(String titulo, String descricao, LocalDate data) {
        setTitulo(titulo);
        setDescricao(descricao);
        this.data = data;
    }

    public Mentoria() {
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public int calcularXp() {
        return XP_PADRAO + 20;
    }

    @Override
    public String toString() {
        return "Curso [titulo= " + getTitulo() + ", descricao= " + getDescricao() + ", data= " + data + "]";
    }

}
