package projeto.java.javacore.Hheranca.exercicio;

public class Gerente extends Funcionario {
    protected String departamento;

    public Gerente(String nome, String cpf, String endereco, String cep, double salario, String departamento) {
        super(nome, cpf, endereco, cep, salario);
        this.departamento = departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }
}
