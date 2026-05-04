package projeto.java.javacore.Oexception.exception.dominio;

public class ProcessaPedidos {
    public static void processar(Pedido pedido) throws EstoqueInsuficienteException {
        System.out.println("--- PROCESSANDO PEDIDOS ---");
        System.out.println(pedido.getProduto());
        System.out.println(pedido.getQuantidade());
        int estoque = 5;
        if (pedido.getQuantidade() > estoque) {
            throw new EstoqueInsuficienteException(
                    "Estoque disponível: " + estoque + "| Pedido solicitado: " + pedido.getQuantidade()
            );
        }
        System.out.printf("Pedido do produto %s processado com sucesso!\n", pedido.getProduto());
    }
}
