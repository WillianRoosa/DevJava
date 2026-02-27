package projeto.java.javacore.enums.exercicio;

public class Funcionario {
    private String nome;
    private Cargo cargo;

    public Funcionario(String nome, Cargo cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome = '" + nome + '\'' +
                ", salarioBase = " + cargo.getSalario() +
                ", salarioComBonus = " + cargo.calcularSalarioComBonus() +
                ", cargo = " + cargo +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public Cargo getCargo() {
        return cargo;
    }
}
