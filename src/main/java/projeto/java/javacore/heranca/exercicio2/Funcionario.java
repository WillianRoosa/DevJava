package projeto.java.javacore.heranca.exercicio2;

public class Funcionario extends Pessoa {
    protected double salario;

    public Funcionario(String nome, String cpf, String endereco, double salario) {
        super(nome, cpf, endereco);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
