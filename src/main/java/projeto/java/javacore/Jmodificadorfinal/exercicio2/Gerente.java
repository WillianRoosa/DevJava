package projeto.java.javacore.Jmodificadorfinal.exercicio2;

public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    public Gerente(String nome, String cpf, double salario, double bonus) {
        super(nome, cpf, salario);
        this.bonus = bonus;
    }

    @Override
    public void relatorio() {
        super.relatorio();
        System.out.printf("Bônus: R$ %.2f | Salário com Bônus: %.2f\n", this.bonus, getSalario() + bonus);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}