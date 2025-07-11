package projeto.java.javacore.heranca.exercicio;

public class Funcionario extends Pessoa {
    protected double salario;

    public Funcionario(String nome, String cpf, String endereco, String cep, double salario) {
        super(nome, cpf, endereco, cep);
        this.salario = salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
}
