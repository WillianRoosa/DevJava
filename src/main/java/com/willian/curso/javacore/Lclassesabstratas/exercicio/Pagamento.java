package com.willian.curso.javacore.Lclassesabstratas.exercicio;

public abstract class Pagamento {
    protected double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public void processar() {
        System.out.println("Processando pagamento...");
    }

    public abstract void imprimirRecibo();
}