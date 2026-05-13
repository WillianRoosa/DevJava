package com.willian.curso.javacore.Bintroducaometodos.test;

import com.willian.curso.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int a = 1;
        int b = 2;
        calculadora.alteraDoisNumeros(a, b);

        System.out.println("\nDentro do test.Bintroducaometodos.javacore.willian.curso.CalculadoraTest02");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
