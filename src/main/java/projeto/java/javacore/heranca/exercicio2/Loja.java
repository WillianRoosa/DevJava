package projeto.java.javacore.heranca.exercicio2;

public class Loja {
    private String nome;
    private Funcionario[] funcionarios;

    public Loja(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }
}
