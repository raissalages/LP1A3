package com.company;

import java.util.Date;

public class Funcionario{
    protected String nome;
    protected int ID;
    protected double salario;

    public Funcionario(String nome, int ID, double salario) {
        this.nome = nome;
        this.ID = ID;
        this.salario = salario;
    }

    public boolean MatchID(Funcionario funcionario1, Funcionario funcionario2){
        return funcionario1.ID == funcionario2.ID;
    }
}
