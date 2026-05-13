package com.willian.curso.javacore.Bintroducaometodos.test;

import com.willian.curso.javacore.Bintroducaometodos.dominio.ContaBancaria;
import com.willian.curso.javacore.Bintroducaometodos.dominio.ImprimeContaBancaria;

public class ContaBancariaTest01 {
    public static void main(String[] args) {
        ContaBancaria cliente = new ContaBancaria();
        cliente.nomeTitular = "Willian Vinicius da Rosa";
        cliente.numeroConta = "106.394.862.895";
        cliente.depositar(200.00);
        cliente.sacar(100.00);

        ImprimeContaBancaria impressora = new ImprimeContaBancaria();
        impressora.imprimirDados(cliente);
    }
}
