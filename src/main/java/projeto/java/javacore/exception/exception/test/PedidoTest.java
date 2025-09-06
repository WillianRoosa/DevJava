package projeto.java.javacore.exception.exception.test;

import projeto.java.javacore.exception.exception.dominio.EstoqueInsuficienteException;
import projeto.java.javacore.exception.exception.dominio.Pedido;
import projeto.java.javacore.exception.exception.dominio.ProcessaPedidos;

public class PedidoTest {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido("Teclado Logitech mx mechanical", 3);
        Pedido pedido2 = new Pedido("Mouse logitech", 6);

        try {
            ProcessaPedidos.processar(pedido1);
        } catch (EstoqueInsuficienteException e) {
            System.out.println("Mercadoria com estoque insuficiente, por favor consultar quantidade..." + e.getMessage());
        }
        try {
            ProcessaPedidos.processar(pedido2);
        } catch (EstoqueInsuficienteException e) {
            System.out.println("Mercadoria com estoque insuficiente, por favor consultar quantidade..." + e.getMessage());
        }
    }
}
