package projeto.java.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome) {
        super(nome);
    }

    public void imprime() {
        super.imprime();
        System.out.printf("Salário: %.2f%n", this.salario);
        relatorioPagamento();
    }

    private void relatorioPagamento() {
        System.out.printf("Eu %s, recebi o pagamento de R$ %.2f", this.nome, this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
