package projeto.java.javacore.modificadorfinal.exercicio;

public class ContaPoupanca extends ContaBancaria {
    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    public String toString() {
        return "Saldo em poupança-> " + super.getSaldo();
    }
}
