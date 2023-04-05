package com.company;

import java.util.ArrayList;
import java.util.List;

public class Empresa{
    private final List<Departamento> departamentos;
    private final String nome;

    public Empresa(String nome) {
        this.departamentos = new ArrayList<>();
        this.nome = nome;
    }

    public void AddDepartamente(Departamento depto){
        departamentos.add(depto);
    }

    public List<Funcionario> ListarFuncionarios(){
        List<Funcionario> funcionarios = new ArrayList<>();
        for(Departamento departamento : departamentos){
            funcionarios.addAll(departamento.ListarFuncionarios());
        }
        return funcionarios;
    }
}
