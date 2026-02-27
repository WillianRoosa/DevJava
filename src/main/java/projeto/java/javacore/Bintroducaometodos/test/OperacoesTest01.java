package projeto.java.javacore.Bintroducaometodos.test;

import projeto.java.javacore.Bintroducaometodos.dominio.Operacoes;

public class OperacoesTest01 {
    public static void main(String[] args) {
        Operacoes operacoes = new Operacoes();

        int num1 = 1;
        int num2 = 2;

        double result = operacoes.somaDoisNumeros(10, 20);
        System.out.println(result);

        System.out.println("------");

        System.out.println("Este é meu num1 do Main: " + num1);
        System.out.println("Este é meu num2 do Main: " + num2);
    }
}
