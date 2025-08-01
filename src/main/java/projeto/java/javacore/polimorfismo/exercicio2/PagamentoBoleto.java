package projeto.java.javacore.polimorfismo.exercicio2;

public class PagamentoBoleto implements FormaDePagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagando R$" + valor + " com boleto bancário.");
    }
}
