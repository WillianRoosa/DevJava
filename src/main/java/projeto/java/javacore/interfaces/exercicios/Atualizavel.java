package projeto.java.javacore.interfaces.exercicios;

public interface Atualizavel {
    void atualizar();

    default void verificarConexao() {
        System.out.println("Verificando conexão com o servidor...");
    }

    static void mostrarVersaoSistema() {
        System.out.println("Versão do sistema: 2.1.0");
    }
}
