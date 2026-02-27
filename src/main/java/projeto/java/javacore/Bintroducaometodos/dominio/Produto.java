package projeto.java.javacore.Bintroducaometodos.dominio;

public class Produto {
    public String nomeProduto;
    private double precoProduto;
    private double descontoProduto = 0.3;

    public void setPrecoProduto(double preco) {
        this.precoProduto = preco;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public double getAplicaDesconto() {
        return this.precoProduto - (this.precoProduto * descontoProduto);
    }
}
