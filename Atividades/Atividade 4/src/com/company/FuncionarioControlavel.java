package com.company;

public abstract class FuncionarioControlavel extends Funcionario implements IControlavel {
    protected double horarioSaida;
    protected double horarioEntrada;

    public FuncionarioControlavel(String nome, int id, double salario) {
        super(nome, id, salario);
    }

    @Override
    public void baterEntrada(float horario) {
        horarioEntrada = horario;
    }

    @Override
    public void baterSaida(float horario) {
        horarioSaida = horario;
    }
}
