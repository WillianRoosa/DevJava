package projeto.java.javacore.polimorfismo.exercicio2;

public class CheckoutService {
    public void processaPagamento(FormaDePagamento forma, double valor) {
        forma.pagar(valor);
    }
}
