package projeto.java.javacore.enums.exercicio;

public class Produto {
    private String nome;
    private double preco;
    private TipoProduto tipoProduto;

    public Produto(String nome, double preco, TipoProduto tipoProduto) {
        this.nome = nome;
        this.preco = preco;
        this.tipoProduto = tipoProduto;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome = '" + nome + '\'' +
                ", preco = " + preco +
                ", tipoProduto = " + tipoProduto +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public TipoProduto getTipoProduto() {
        return tipoProduto;
    }
}
