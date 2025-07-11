package projeto.java.javacore.heranca.exercicio;

public class ImprimeDados01 {
    public void imprimeFuncionario(Funcionario funcionario) {
        System.out.println("--- Funcionário ---");
        System.out.println("Nome funcionário -> " + funcionario.getNome());
        System.out.println("CPF funcionário -> " + funcionario.getCpf());
        System.out.println("Endereco funcionário -> " + funcionario.getEndereco());
        System.out.println("CEP funcionário -> " + funcionario.getCep());
        System.out.println("Salário do funcionário -> " + funcionario.getSalario());
    }

    public void imprimeGerente(Gerente gerente) {
        System.out.println();
        System.out.println("--- Gerente ---");
        System.out.println("Nome gerente -> " + gerente.getNome());
        System.out.println("CPF gerente -> " + gerente.getCpf());
        System.out.println("Endereco gerente -> " + gerente.getEndereco());
        System.out.println("CEP gerente -> " + gerente.getCep());
        System.out.println("Salário do gerente -> " + gerente.getSalario());
    }

    public void relatorioPagamento(Funcionario funcionario, Gerente gerente) {
        System.out.println("--- Relatório de Pagamento ---");
        System.out.println("--- Gerente ---");
        System.out.println("Nome gerente -> " + gerente.getNome());
        System.out.println("CPF gerente -> " + gerente.getCpf());
        System.out.println("Endereco gerente -> " + gerente.getEndereco());
        System.out.println("CEP gerente -> " + gerente.getCep());
        System.out.println("Salário do gerente -> " + gerente.getSalario());
        System.out.println();
        System.out.println("--- Funcionário ---");
        System.out.println("Nome funcionário -> " + funcionario.getNome());
        System.out.println("CPF funcionário -> " + funcionario.getCpf());
        System.out.println("Endereco funcionário -> " + funcionario.getEndereco());
        System.out.println("CEP funcionário -> " + funcionario.getCep());
        System.out.println("Salário do funcionário -> " + funcionario.getSalario());
        System.out.println("Departamento -> " + gerente.getDepartamento());
    }
}
