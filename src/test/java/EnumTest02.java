import projeto.java.javacore.enums.exercicio.Produto;
import projeto.java.javacore.enums.exercicio.TipoProduto;

public class EnumTest02 {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Maça", 20.00, TipoProduto.ALIMENTO);
        Produto produto2 = new Produto("Vodka", 80.00, TipoProduto.BEBIDA);
        Produto produto3 = new Produto("MacBook", 15000.00, TipoProduto.ELETRONICO);

        System.out.println(produto1);
        System.out.println("ValorDesconto = "+ TipoProduto.ALIMENTO.calcularDesconto(20.00));
        System.out.println(produto2);
        System.out.println("ValorDesconto = "+ TipoProduto.BEBIDA.calcularDesconto(80.00));
        System.out.println(produto3);
        System.out.println("ValorDesconto = "+ TipoProduto.ELETRONICO.calcularDesconto(15000.00));
    }
}
