package projeto.java.javacore.polimorfismo.dominio;

public class Televisao extends Produto {
    private static final double PORCENTAGEM_IMPOSTO = 0.21;

    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do Televisão!");
        return this.valor * PORCENTAGEM_IMPOSTO;
    }
}
