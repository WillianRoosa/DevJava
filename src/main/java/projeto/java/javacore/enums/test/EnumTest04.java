package projeto.java.javacore.enums.test;

import projeto.java.javacore.enums.exercicio.FormaPagamento;
import projeto.java.javacore.enums.exercicio.Pedido;

public class EnumTest04 {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido("24.06.02", 2300.00, FormaPagamento.PIX);
        Pedido pedido2 = new Pedido("26-4.62", 200.00, FormaPagamento.BOLETO);
        Pedido pedido3 = new Pedido("092-56.09", 5600.00, FormaPagamento.CARTAO);

        Pedido[] pedidos = {pedido1, pedido2, pedido3};

        for (Pedido pedido : pedidos) {
            System.out.println(pedido);
        }
    }
}