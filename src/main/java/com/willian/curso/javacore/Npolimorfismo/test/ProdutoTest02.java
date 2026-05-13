package com.willian.curso.javacore.Npolimorfismo.test;

import com.willian.curso.javacore.Npolimorfismo.dominio.Computador;
import com.willian.curso.javacore.Npolimorfismo.dominio.Produto;
import com.willian.curso.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto1 = new Computador("MacBook Air M3", 17000.00);
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
