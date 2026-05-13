package com.willian.curso.javacore.Npolimorfismo.test;

import com.willian.curso.javacore.Npolimorfismo.dominio.Computador;
import com.willian.curso.javacore.Npolimorfismo.dominio.Produto;
import com.willian.curso.javacore.Npolimorfismo.dominio.Tomate;
import com.willian.curso.javacore.Npolimorfismo.servico.CalculadoraImposto;

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
