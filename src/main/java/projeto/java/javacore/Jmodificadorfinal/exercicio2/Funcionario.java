package projeto.java.javacore.Jmodificadorfinal.exercicio2;

public class Funcionario extends Pessoa {
    private double salario;
    private final String ID;
    private static int contadorIDs;

    @Override
    public String toString() {
        return "{" + "ID='" + ID + '\'' + ", nome='" + nome + '\'' + ", cpf='" + cpf + '\'' + ", endereco=" + endereco + ", salario=" + salario + '}';
    }

    public Funcionario(String nome, String cpf, double salario) {
        super(nome, cpf);
        this.salario = salario;
        this.ID = String.valueOf(++contadorIDs);
    }

    @Override
    public void relatorio() {
        System.out.println("Funcionário ID: " + this.ID);
        super.relatorio();
        System.out.printf("Salário: R$ %.2f\n", this.salario);
    }

    public final void aumentarSalario(double percentual) {
        salario += (salario * percentual / 100);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario < 0) {
            throw new IllegalArgumentException("Salário inválido!");
        }
        this.salario = salario;
    }

    public String getID() {
        return ID;
    }
}
