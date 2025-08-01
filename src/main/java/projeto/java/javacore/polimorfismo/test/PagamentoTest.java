package projeto.java.javacore.polimorfismo.test;

import projeto.java.javacore.polimorfismo.exercicio2.*;

public class PagamentoTest {
    public static void main(String[] args) {
        CheckoutService service = new CheckoutService();

        FormaDePagamento pagamento1 = new PagamentoCartaoCredito();
        FormaDePagamento pagamento2 = new PagamentoBoleto();
        FormaDePagamento pagamento3 = new PagamentoPix();

        double valor = 250.0;

        service.processaPagamento(pagamento1, valor);
        service.processaPagamento(pagamento2, valor);
        service.processaPagamento(pagamento3, valor);
    }
}
