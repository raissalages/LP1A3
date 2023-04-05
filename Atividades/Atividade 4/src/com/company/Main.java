package com.company;

public class Main {

    public static void main(String[] args) {
        Empresa empresa = new Empresa("Sequestradora");
        Departamento<DevDePython> depto = new Departamento<DevDePython>("Departamento de programador Lixeira");
        DevDePython dev = new DevDePython("Rogerin", 1234, 2.50);
        Gerente gerente = new Gerente("Claudio", 315476598, 111111111);

        depto.AddFuncionario(dev, gerente);
        empresa.AddDepartamente(depto);
        empresa.ListarFuncionarios();

    }
}
