package projeto.java.javacore.exception.runtime.test;

public class ArquivoConexao {
    public static void main(String[] args) {
        try {
            abrir();
            ler("dados.txt");
            ler("erro.txt");
        } catch (RuntimeException e) {
            System.out.println("Leitura de arquivo negada: " + e.getMessage());
        } finally {
            fechar();
        }
    }

    private static void abrir() {
        System.out.println("Arquivo aberto");
    }

    private static void ler(String nomeArquivo) {
        if ("erro.txt".equals(nomeArquivo)) {
            throw new RuntimeException("falha ao ler o arquivo -> " + nomeArquivo);
        } else {
            System.out.println("Lendo {" + nomeArquivo + "} com sucesso!");
        }
    }

    private static void fechar() {
        System.out.println("Arquivo fechado");
    }
}
