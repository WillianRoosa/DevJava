package projeto.java.javacore.modificadorfinal.exercicio;

public class DadosContaBancaria {
    public final void mostrarSaldo(ContaBancaria contaBancaria) {
        System.out.println("--- Conta Bancária ---");
        System.out.println(contaBancaria.getSaldo());
        System.out.println(ContaBancaria.TAXA_TRANSFERENCIA);
    }

    public final void mostrarPoupanca(ContaPoupanca poupanca) {
        System.out.println();
        System.out.println("--- Saldo Poupança ---");
        System.out.println(poupanca.getSaldo());
    }
}
