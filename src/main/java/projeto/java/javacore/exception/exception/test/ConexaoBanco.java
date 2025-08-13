package projeto.java.javacore.exception.exception.test;

import java.io.IOException;

public class ConexaoBanco {
    public static void main(String[] args) {
        try {
            abrir();
            consultar("SELECT * FROM tabela");
            consultar(""); // consulta inválida para forçar a exceção
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } finally {
            fechar();
        }
    }

    public static void abrir() {
        System.out.println("Conexão aberta!");
    }

    public static void fechar() {
        System.out.println("Conexão fechada!");
    }

    private static void consultar(String sql) {
        if (sql == null || sql.trim().isEmpty()) {
            throw new IllegalArgumentException("SQL inválido!");
        }
        System.out.println("Consulta realizada: " + sql);
    }
}
