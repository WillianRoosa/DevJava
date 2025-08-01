package projeto.java.javacore.polimorfismo.test;

import projeto.java.javacore.polimorfismo.dominio.Computador;
import projeto.java.javacore.polimorfismo.dominio.Produto;
import projeto.java.javacore.polimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto1 = new Computador("Macbook Air M3", 17000.00);
        System.out.println(produto1.getNome());
        System.out.println(produto1.getValor());
        System.out.println(produto1.calcularImposto());

        System.out.println("---------");

        Produto produto2 = new Tomate("Tomate Débra", 20.00);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
    }
}
