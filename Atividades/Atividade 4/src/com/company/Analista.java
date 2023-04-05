package com.company;

public class Analista extends FuncionarioControlavel {
    private String linguagemOdiada;

    public Analista(String nome, int id, double salario, String linguagemOdiada) {
        super(nome, id, salario);
        this.linguagemOdiada = linguagemOdiada;
    }

}
