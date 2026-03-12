package projeto.java.javacore.Jmodificadorfinal.test;

import projeto.java.javacore.Jmodificadorfinal.exercicio2.*;

public class SistemaEmpresaTest {
    public static void main(String[] args) {
        SistemaEmpresa sistema = SistemaEmpresa.getInstance();

        Endereco endereco1 = new Endereco("São José dos Campos", "São Paulo", "Rua das Laranjeiras", 545);
        Endereco endereco2 = new Endereco("São Bento do Sapucaí", "São Paulo", "Conselheiro Rodrigues Alves", 985);
        Endereco endereco3 = new Endereco("São Paulo", "São Paulo", "Avanida Paulista", 4890);
        Endereco endereco4 = new Endereco("Sorocaba", "São Paulo", "Travessa Augusto Maracaibo", 701);

        Funcionario funcionario1 = new Funcionario("Maria Zélia da Rosa", "123.456.789-10", 5600);
        funcionario1.setEndereco(endereco1);

        Gerente gerente1 = new Gerente("Willian Rosa", "098.765.432-67", 10800, 1500);
        gerente1.setEndereco(endereco2);

        Funcionario funcionario2 = new Funcionario("Edson Roberto da Rosa", "123.456.789-85", 6800);
        funcionario2.setEndereco(endereco3);

        Gerente gerente2 = new Gerente("José Roberto da Rosa", "123.456.789-90", 9600);
        gerente2.setEndereco(endereco4);

        Funcionario[] listaDeFuncionarios1 = {funcionario1, gerente1};
        Funcionario[] listaDeFuncionarios2 = {funcionario2, gerente2};

        Departamento departamento = new Departamento("Software Enginner", 5);
        departamento.setFuncionarios(listaDeFuncionarios1);
        departamento.listarFuncionarios();

        Departamento departamento1 = new Departamento("Data Engineering", 5);
        departamento1.setFuncionarios(listaDeFuncionarios2);
        departamento1.listarFuncionarios();

        System.out.println("\n--- RELATÓRIO DO DEPARTAMENTO ---");
        sistema.registrarFuncionario(listaDeFuncionarios1);
        sistema.registrarFuncionario(listaDeFuncionarios2);
    }
}
