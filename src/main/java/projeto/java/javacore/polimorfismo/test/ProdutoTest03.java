package projeto.java.javacore.polimorfismo.test;

import projeto.java.javacore.polimorfismo.dominio.Computador;
import projeto.java.javacore.polimorfismo.dominio.Produto;
import projeto.java.javacore.polimorfismo.dominio.Tomate;
import projeto.java.javacore.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto1 = new Computador("Macbook Air M3", 17000.00);

        Tomate tomate = new Tomate("Tomate Débra", 20.00);
        tomate.setDataValidade("23/10/2025");

        CalculadoraImposto.impostoProduto(tomate);
        System.out.println("----------");
        CalculadoraImposto.impostoProduto(produto1);
    }
}
