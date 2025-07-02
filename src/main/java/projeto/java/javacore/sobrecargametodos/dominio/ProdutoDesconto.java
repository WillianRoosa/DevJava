package projeto.java.javacore.sobrecargametodos.dominio;

public class ProdutoDesconto {
    private String nome;
    private double preco;
    private double desconto;

    public void cadastrarProduto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void cadastrarProduto(String nome, double preco, double desconto) {
        cadastrarProduto(nome, preco);
        this.desconto = desconto;

        // Aplica o desconto diretamente ao atributo preco
        this.preco = preco - (preco * desconto/100);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
}
