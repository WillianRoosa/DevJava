package projeto.java.javacore.Npolimorfismo.test;

import projeto.java.javacore.Npolimorfismo.dominio.Computador;
import projeto.java.javacore.Npolimorfismo.dominio.Tomate;
import projeto.java.javacore.Npolimorfismo.servico.CalculadoraImposto;
import projeto.java.javacore.Npolimorfismo.dominio.Televisao;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Apple Mac Mini M4", 5000.00);
        Tomate tomate = new Tomate("Tomate Campestrão", 10.00);
        Televisao tv = new Televisao("LG UltraGear 50\" ", 7500.00);

        CalculadoraImposto.impostoProduto(computador);
        System.out.println("--------------------");
        CalculadoraImposto.impostoProduto(tomate);
        System.out.println("--------------------");
        CalculadoraImposto.impostoProduto(tv);
    }
}
