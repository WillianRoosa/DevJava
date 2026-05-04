package projeto.java.javacore.Npolimorfismo.exercicios.exercicio2;

public class PagamentoBoleto implements FormaDePagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagando R$" + valor + " com boleto bancário.");
    }
}
