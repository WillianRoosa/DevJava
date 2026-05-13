package com.willian.curso.javacore.Npolimorfismo.exercicios.exercicio2;

public class PagamentoPix implements FormaDePagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagando R$" + valor + " via Pix.");
    }
}
