import projeto.java.javacore.modificadorfinal.exercicio.ContaBancaria;
import projeto.java.javacore.modificadorfinal.exercicio.ContaPoupanca;
import projeto.java.javacore.modificadorfinal.exercicio.DadosContaBancaria;

public class ContaBancariaTest02 {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria(100000.00);
        ContaPoupanca poupanca = new ContaPoupanca(75000.00);

        DadosContaBancaria imprime = new DadosContaBancaria();
        imprime.mostrarSaldo(contaBancaria);
        imprime.mostrarPoupanca(poupanca);
    }
}
