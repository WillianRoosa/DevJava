package projeto.java.javacore.enums.exercicio;

public enum Cargo {
    ANALISTA(2200.00) {
        @Override
        public double calcularSalarioComBonus() {
            return this.salario * 1.10;
        }
    },
    GERENTE(4500.00) {
        @Override
        public double calcularSalarioComBonus() {
            return this.salario * 1.20;
        }
    },
    DIRETOR(10200.00) {
        @Override
        public double calcularSalarioComBonus() {
            return this.salario + 1000;
        }
    };

    protected double salario;

    Cargo(double salario) {
        this.salario = salario;
    }

    public abstract double calcularSalarioComBonus();

    public double getSalario() {
        return salario;
    }
}
