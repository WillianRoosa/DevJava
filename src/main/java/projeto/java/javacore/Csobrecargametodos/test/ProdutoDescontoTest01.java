package projeto.java.javacore.Csobrecargametodos.test;

import projeto.java.javacore.Csobrecargametodos.dominio.ImprimeProdutoDesconto;
import projeto.java.javacore.Csobrecargametodos.dominio.ProdutoDesconto;

public class ProdutoDescontoTest01 {
    public static void main(String[] args) {
        ProdutoDesconto produto1 = new ProdutoDesconto();
        produto1.cadastrarProduto("MacBook Air M3", 10200.00);

        ProdutoDesconto produto2 = new ProdutoDesconto();
        produto2.cadastrarProduto("MacBook Air M4", 15750.00, 4);

        ImprimeProdutoDesconto impressora = new ImprimeProdutoDesconto();
        impressora.imprimeProdutoDesconto(produto1);
        impressora.imprimeProdutoDesconto(produto2);
    }
}
