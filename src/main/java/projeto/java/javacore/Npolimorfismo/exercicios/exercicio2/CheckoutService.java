package projeto.java.javacore.Npolimorfismo.exercicios.exercicio2;

public class CheckoutService {
    public void processaPagamento(FormaDePagamento forma, double valor) {
        forma.pagar(valor);
    }
}
