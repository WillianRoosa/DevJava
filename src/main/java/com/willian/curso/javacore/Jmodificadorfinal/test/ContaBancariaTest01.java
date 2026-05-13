package com.willian.curso.javacore.Jmodificadorfinal.test;

import com.willian.curso.javacore.Jmodificadorfinal.exercicio.ContaBancaria;
import com.willian.curso.javacore.Jmodificadorfinal.exercicio.ContaPoupanca;
import com.willian.curso.javacore.Jmodificadorfinal.exercicio.DadosContaBancaria;

public class ContaBancariaTest01 {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria(100000.00);
        ContaPoupanca poupanca = new ContaPoupanca(75000.00);

        DadosContaBancaria imprime = new DadosContaBancaria();
        imprime.mostrarSaldo(contaBancaria);
        imprime.mostrarPoupanca(poupanca);
    }
}
