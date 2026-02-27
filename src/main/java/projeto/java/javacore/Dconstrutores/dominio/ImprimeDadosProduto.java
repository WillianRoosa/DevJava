package projeto.java.javacore.Dconstrutores.dominio;

public class ImprimeDadosProduto {
    public void imprimeDados(Produto produto) {
        System.out.println("Nome do Produto: " + produto.getNomeProduto());
        System.out.printf("Preço: R$ %.2f\n", produto.getPreco());
        System.out.println("Quantidade em Estoque: " + produto.getQuantidadeEstoque());
        System.out.println("Categoria: " + produto.getCategoria());
        System.out.println("-----------------------------");
    }
}
