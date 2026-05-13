package com.willian.curso.javacore.Oexception.exception.test;

import com.willian.curso.javacore.Oexception.exception.dominio.EstoqueInsuficienteException;
import com.willian.curso.javacore.Oexception.exception.dominio.Pedido;
import com.willian.curso.javacore.Oexception.exception.dominio.ProcessaPedidos;

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
