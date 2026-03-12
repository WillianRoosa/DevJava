package projeto.java.javacore.Hheranca.test;

import projeto.java.javacore.Hheranca.exercicio.Funcionario;
import projeto.java.javacore.Hheranca.exercicio.Gerente;
import projeto.java.javacore.Hheranca.exercicio.ImprimeDados01;

public class HerancaTest02 {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("David da Silva", "987.654.321-00",
                "Rua das Laranjeiras", "98765-432", 2200.00);

        Gerente gerente = new Gerente("Willian Rosa", "123.456.789-00", "Bosque dos Eucáliptos", "12345-678",
                10000.00, "Gerencia");

        ImprimeDados01 imprime = new ImprimeDados01();
        imprime.relatorioPagamento(funcionario1, gerente);
    }
}
