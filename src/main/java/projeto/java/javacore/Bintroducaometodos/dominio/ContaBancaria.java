package projeto.java.javacore.Bintroducaometodos.dominio;

public class ContaBancaria {
    public String nomeTitular;
    public String numeroConta;
    private double saldoConta = 100000.00;

    public void depositar(double depositar) {
        this.saldoConta += depositar;
    }

    public void sacar(double saque) {
        this.saldoConta -= saque;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void dadosContaBancaria() {
        System.out.println("Saldo atual: R$" + this.getSaldoConta());
    }
}
