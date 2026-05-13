package com.willian.curso.javacore.Lclassesabstratas.exercicio;

public class Cartao extends Pagamento implements Taxavel {

    public Cartao(double valor) {
        super(valor);
    }

    @Override
    public double calcularTaxa() {
        return this.valor * 0.05;
    }

    @Override
    public void imprimirRecibo() {
        double taxa = calcularTaxa();
        System.out.printf("Taxa: %.2f\n", taxa);
        System.out.printf("Pagamento via Cartão no valor de R$ %.2f\n", this.valor);
    }
}
