package projeto.java.javacore.heranca.exercicio;

public class ImprimeDados02 {
    public void empresaDados(Empresa empresa) {
        System.out.println("--- Quadro de funcionários ---");
        for (Funcionario funcionarios : empresa.getFuncionarios()) {
            System.out.println("Nome: " + funcionarios.getNome() + "\nCPF: " + funcionarios.getCpf() + "\nRua: "
                    + funcionarios.getEndereco() + "\nCEP: " + funcionarios.getCep() + "\nSalário: "
                    + funcionarios.getSalario() + "\nEmpresa: " + empresa.getNomeEmpresa());
            System.out.println();
        }
    }
}
