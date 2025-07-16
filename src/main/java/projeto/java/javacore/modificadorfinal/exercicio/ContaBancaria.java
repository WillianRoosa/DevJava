package projeto.java.javacore.modificadorfinal.exercicio;

public class ContaBancaria {
    private double saldo;
    public static final double TAXA_TRANSFERENCIA = 0.10;

    public String toString() {
        return "Saldo bancário total -> " + this.saldo
                + "\nTaxa de transferência -> " + ContaBancaria.TAXA_TRANSFERENCIA;
    }

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
