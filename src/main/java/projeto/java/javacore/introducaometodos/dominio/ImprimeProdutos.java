package projeto.java.javacore.introducaometodos.dominio;

public class ImprimeProdutos {
    public void retornoProduto(Produto imprime) {
        System.out.println("Nome Produto: " + imprime.nomeProduto);
        System.out.println("Valor Produto: R$" + imprime.getPrecoProduto());
        System.out.println("Valor Produto com desconto: R$" + imprime.getAplicaDesconto());
    }
}
