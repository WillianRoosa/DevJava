package com.willian.curso.javacore.Bintroducaometodos.test;

import com.willian.curso.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1, 2, 3, 4, 5};
        calculadora.somaArray(numeros);

        calculadora.somaVarArgs(1, 2, 3, 4, 5, 6, 7);
    }
}
