package projeto.java.javacore.heranca.exercicio2;

public class ImprimeDados {
    public void dadosLoja(Loja loja) {
        System.out.println("--- Dados Loja ---\n");
        System.out.println("Nome da Loja -> " + loja.getNome());
        System.out.println();
    }

    public void dadosFuncionarios(Funcionario funcionario) {
        System.out.println("--- Funcionário ---\n");
        System.out.println("Nome do funcionário -> " + funcionario.getNome());
        System.out.println("Funcionário Cpf -> " + funcionario.getCpf());
        System.out.println("Funcionário Endereço -> " + funcionario.getEndereco());
        System.out.println("Salário do funcionário -> " + funcionario.getSalario());
        System.out.println();
    }

    public void dadosVendedor(Vendedor vendedor) {
        System.out.println("--- Vendedores ---\n");
        System.out.println("Nome do vendedor -> " + vendedor.getNome());
        System.out.println("Vendedor Cpf -> " + vendedor.getCpf());
        System.out.println("Vendedor Endereço -> " + vendedor.getEndereco());
        System.out.println("Salário do vendedor -> " + vendedor.getSalario());
        System.out.println("Meta Mensal -> " + vendedor.getMetaMensal());
        System.out.println();
    }

    public void dadosGerente(Gerente gerente) {
        System.out.println("--- Gerente ---\n");
        System.out.println("Nome do gerente -> " + gerente.getNome());
        System.out.println("gerente Cpf -> " + gerente.getCpf());
        System.out.println("gerente Endereço -> " + gerente.getEndereco());
        System.out.println("Salário do gerente -> " + gerente.getSalario());
        System.out.println();
    }
}
