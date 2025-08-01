package projeto.java.javacore.polimorfismo.dominio;

public class Tomate extends Produto {
    private static final double PORCENTAGEM_IMPOSTO = 0.06;

    private String dataValidade;

    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto Tomate!");
        return this.valor * PORCENTAGEM_IMPOSTO;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
