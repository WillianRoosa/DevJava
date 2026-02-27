package projeto.java.javacore.Bintroducaometodos.test;

import projeto.java.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Willian");
        funcionario.setIdade(23);
        funcionario.setSalarios(new double[]{2200.00, 2487.20, 3290.90});

        funcionario.imprime();
    }
}
