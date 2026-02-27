package projeto.java.javacore.Bintroducaometodos.test;

import projeto.java.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int a = 1;
        int b = 2;
        calculadora.alteraDoisNumeros(a, b);

        System.out.println("\nDentro do projeto.java.javacore.Bintroducaometodos.test.CalculadoraTest02");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
