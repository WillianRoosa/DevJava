package com.willian.curso.javacore.Npolimorfismo.test;

import com.willian.curso.javacore.Npolimorfismo.dominio.Computador;
import com.willian.curso.javacore.Npolimorfismo.dominio.Tomate;
import com.willian.curso.javacore.Npolimorfismo.servico.CalculadoraImposto;
import com.willian.curso.javacore.Npolimorfismo.dominio.Televisao;

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

        // Testando GitHub no novo projeto clonado..
    }
}
