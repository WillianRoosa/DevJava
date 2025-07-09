package projeto.java.javacore.heranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    public void imprime() {
        super.imprime();
        System.out.println("Salário: " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
