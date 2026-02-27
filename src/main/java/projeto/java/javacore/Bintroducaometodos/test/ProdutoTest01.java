package projeto.java.javacore.Bintroducaometodos.test;

import projeto.java.javacore.Bintroducaometodos.dominio.ImprimeProdutos;
import projeto.java.javacore.Bintroducaometodos.dominio.Produto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.nomeProduto = "MacBook Air M4";
        produto1.setPrecoProduto(15000.00);

        ImprimeProdutos impressora = new ImprimeProdutos();
        impressora.retornoProduto(produto1);
    }
}
