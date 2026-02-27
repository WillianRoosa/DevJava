package projeto.java.javacore.Bintroducaometodos.test;

import projeto.java.javacore.Bintroducaometodos.dominio.ContaBancaria;
import projeto.java.javacore.Bintroducaometodos.dominio.ImprimeContaBancaria;

public class ContaBancariaTest01 {
    public static void main(String[] args) {
        ContaBancaria cliente = new ContaBancaria();
        cliente.nomeTitular = "Willian Vinicius da Rosa";
        cliente.numeroConta = "106.394.862.895";
        cliente.depositar(200.00);
        cliente.sacar(100.00);

        ImprimeContaBancaria impressora = new ImprimeContaBancaria();
        impressora.imprimirDados(cliente);
    }
}
