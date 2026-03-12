package projeto.java.javacore.Jmodificadorfinal.exercicio2;

public class Departamento {
    private String nome;
    private Funcionario[] funcionarios;

    static {
        System.out.println("===== SISTEMA DE GESTÃO INICIADO =====");
    }

    {
        System.out.println("===== DEPARTAMENTO =====");
    }

    public Departamento(String nome, int capacidade) {
        this.nome = nome;
        this.funcionarios = new Funcionario[capacidade];
    }

    public void listarFuncionarios() {
        boolean funcionarioCadastrado = false;
        System.out.printf("Departamento: %s\n", this.nome);
        for (Funcionario funcionario : funcionarios) {
            if (funcionario != null) {
                System.out.println("Funcionário: " + funcionario);
                funcionarioCadastrado = true;
            }
        }
        if (!funcionarioCadastrado) {
            System.out.println("Nenhum funcionário cadastrado.");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }
}
