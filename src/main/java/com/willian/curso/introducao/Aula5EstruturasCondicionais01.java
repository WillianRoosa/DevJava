package com.willian.curso.introducao;

public class Aula5EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 18;
        boolean isAutorizadoCompra = idade >= 18;

        if (isAutorizadoCompra) {
            System.out.println("Venda autorizada");
        } else {
            System.out.println("Não autorizado a compra");
        }
    }
}
