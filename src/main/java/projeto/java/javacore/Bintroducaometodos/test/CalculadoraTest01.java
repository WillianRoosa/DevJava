package projeto.java.javacore.Bintroducaometodos.test;

import projeto.java.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        // Aprendendo o uso de métodos, com void - Vazio.
        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumeros();

        // Aprendendo Métodos, uso de parametro.
        calculadora.multiplicaDoisNumeros(10, 3);

        // Aprendendo Métodos, uso de Retorno.
        double resultado = calculadora.divideDoisNumeros(10, 2);
        System.out.println(resultado);

        // Aprendendo uso do return com void.
        calculadora.imprimeDivisao(100, 2);
    }
}
