package com.willian.curso.javacore.Bintroducaometodos.test;

import com.willian.curso.javacore.Bintroducaometodos.dominio.EmpresaFuncionario;
import com.willian.curso.javacore.Bintroducaometodos.dominio.ImprimePagamentoEmpresa;

public class EmpresaFuncionarioTest01 {
    public static void main(String[] args) {
        EmpresaFuncionario funcionario1 = new EmpresaFuncionario();
        funcionario1.nome = "Willian";
        funcionario1.idade = 23;
        funcionario1.salarios = new double[] { 2280.00, 2500.00, 2200.00 };

        EmpresaFuncionario funcionario2 = new EmpresaFuncionario();
        funcionario2.nome = "Vinicius";
        funcionario2.idade = 24;
        funcionario2.salarios = new double[] { 4680.00, 3000.00, 2540.00 };

        ImprimePagamentoEmpresa impressora = new ImprimePagamentoEmpresa();
        impressora.imprime(funcionario1);
        System.out.println();
        impressora.imprime(funcionario2);
    }
}
