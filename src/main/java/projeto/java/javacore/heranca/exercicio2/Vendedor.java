package projeto.java.javacore.heranca.exercicio2;

public class Vendedor extends Funcionario {
    protected double metaMensal;

    public Vendedor(String nome, String cpf, String endereco, double salario, double metaMensal) {
        super(nome, cpf, endereco, salario);
        this.metaMensal = metaMensal;
    }

    public double getMetaMensal() {
        return metaMensal;
    }

    public void setMetaMensal(double metaMensal) {
        this.metaMensal = metaMensal;
    }
}
