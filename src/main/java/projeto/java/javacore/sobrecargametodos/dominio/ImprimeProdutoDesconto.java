package projeto.java.javacore.sobrecargametodos.dominio;

public class ImprimeProdutoDesconto {
    public void imprimeProdutoDesconto(ProdutoDesconto produto) {
        System.out.println("----- Produto -----");
        System.out.println("Nome do Produto: " + produto.getNome());
        System.out.println("Preço do Produto: R$" + produto.getPreco());
        System.out.println("Desconto aplicado no Produto: " + produto.getDesconto() + "%");
    }
}
