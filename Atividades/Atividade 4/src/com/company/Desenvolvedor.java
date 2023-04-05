package com.company;

public class Desenvolvedor extends FuncionarioControlavel {
    private String linguageFavorita;

    public Desenvolvedor(String nome, int id, double salario, String linguageFavorita) {
        super(nome, id, salario);
        this.linguageFavorita = linguageFavorita;
    }

}
