package projeto.java.javacore.Dconstrutores.dominio;

public class Produto {
    private String nomeProduto;
    private double preco;
    private int quantidadeEstoque;
    private String categoria;

    public Produto(String nomeProduto, double preco) {
        this.nomeProduto = nomeProduto;
        this.preco = preco;
    }

    public Produto(String nomeProduto, double preco, int quantidadeEstoque, String categoria) {
        this(nomeProduto, preco);
        this.quantidadeEstoque = quantidadeEstoque;
        this.categoria = categoria;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public String getCategoria() {
        return categoria;
    }
}
