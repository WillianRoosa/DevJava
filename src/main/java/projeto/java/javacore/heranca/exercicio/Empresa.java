package projeto.java.javacore.heranca.exercicio;

public class Empresa {
    protected String nomeEmpresa;
    protected Funcionario[] funcionarios;

    public Empresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }
}
