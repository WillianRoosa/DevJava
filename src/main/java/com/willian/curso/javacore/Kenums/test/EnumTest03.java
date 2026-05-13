package com.willian.curso.javacore.Kenums.test;

import com.willian.curso.javacore.Kenums.exercicio.Cargo;
import com.willian.curso.javacore.Kenums.exercicio.Funcionario;

public class EnumTest03 {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Willian Rosa", Cargo.DIRETOR);
        Funcionario funcionario2 = new Funcionario("Edson Rosa", Cargo.GERENTE);
        Funcionario funcionario3 = new Funcionario("Alex Rosa", Cargo.ANALISTA);

        Funcionario[] funcionarios = {funcionario1, funcionario2, funcionario3};

        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }
}
