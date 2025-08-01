package projeto.java.javacore.polimorfismo.exercicio2;

public class PagamentoCartaoCredito implements FormaDePagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagando R$" + valor + " com cartão de crédito.");
    }
}
