package projeto.java.javacore.Npolimorfismo.exercicio2;

public class CheckoutService {
    public void processaPagamento(FormaDePagamento forma, double valor) {
        forma.pagar(valor);
    }
}
