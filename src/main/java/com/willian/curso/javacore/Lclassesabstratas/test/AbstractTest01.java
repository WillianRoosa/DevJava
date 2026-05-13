package com.willian.curso.javacore.Lclassesabstratas.test;

import com.willian.curso.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import com.willian.curso.javacore.Lclassesabstratas.dominio.Gerente;

public class AbstractTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Roberto Rosa", 5000.00);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Willian Rosa", 12000.00);

        gerente.calculaBonus();
        desenvolvedor.calculaBonus();

        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}