package projeto.java.javacore.introducaometodos.dominio;

public class ImprimeContaBancaria {
    public void imprimirDados(ContaBancaria imprime) {
        System.out.println("Nome do titular: " + imprime.nomeTitular);
        System.out.println("Conta do titular: " + imprime.numeroConta);
        imprime.dadosContaBancaria();
    }
}
