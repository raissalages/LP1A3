package com.company;

import java.util.ArrayList;
import java.util.List;

public class Departamento<T extends FuncionarioControlavel>{
    private final String nome;
    private final List<T> funcionariosBativeis;
    private final List<Gerente> gerentes;

    public Departamento(String nome) {
        this.nome = nome;
        this.funcionariosBativeis = new ArrayList<>();
        this.gerentes = new ArrayList<>();
    }

    public void AddFuncionario(T funcionario, Gerente gerente){
        funcionariosBativeis.add(funcionario);
        gerentes.add(gerente);
    }

    public List<Funcionario> ListarFuncionarios(){
        List<Funcionario> funcionarios = new ArrayList<>(funcionariosBativeis);
        funcionarios.addAll(gerentes);

        return funcionarios;
    }

    public List<FuncionarioControlavel> ListarAtrasados(float horarioLimite){
        List<FuncionarioControlavel> atrasados= new ArrayList<>();

        for(FuncionarioControlavel funcionario : funcionariosBativeis){
            if (funcionario.ID > horarioLimite){
                atrasados.add(funcionario);
            }
        }

        return atrasados;
    }
}
