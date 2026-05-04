package projeto.java.javacore.Npolimorfismo.exercicio2;

public class PagamentoPix implements FormaDePagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagando R$" + valor + " via Pix.");
    }
}
