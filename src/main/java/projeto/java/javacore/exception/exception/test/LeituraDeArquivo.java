package projeto.java.javacore.exception.exception.test;

import java.io.FileNotFoundException;
import java.io.IOException;

public class LeituraDeArquivo {
    public static void main(String[] args) {
        try {
            carregarConfiguracao("application.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Processo finalizado...");
        }
    }

    private static void carregarConfiguracao(String caminhoArquivo) throws FileNotFoundException, IOException {
        if (caminhoArquivo == null || caminhoArquivo.trim().isEmpty()) {
            throw new FileNotFoundException("Arquivo não encontrado!");
        }

        if ("arquivo.txt".equals(caminhoArquivo)) {
            throw new IOException("Erro de leitura!");
        }

        System.out.println("Arquivo carregado com sucesso!");
    }
}
