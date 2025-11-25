package projeto.java.javacore.exception.exception.dominio;

import java.io.IOException;

public class ArquivoConfig implements AutoCloseable {

    public static void main(String[] args) {
        ArquivoConfig.carregar("config.yml");
        ArquivoConfig.carregar("vazio.yml");
        ArquivoConfig.carregar("invalido.yml");
    }

    public static void carregar(String nomeArquivo) {

        try (ArquivoConfig config = new ArquivoConfig(nomeArquivo)) {
            config.ler();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    String nomeArquivo = "arquivoJava";

    public ArquivoConfig(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    @Override
    public void close() throws Exception {
        System.out.println("Fechando arquivo: " + nomeArquivo);
    }

    public void ler() throws Exception {
        if ("config.yml".equals(nomeArquivo)) {
            System.out.println("arquivo lido com sucesso.");
        } else if ("vazio.yml".equals(nomeArquivo)) {
            throw new IOException("arquivo vázio");
        } else if ("invalido.yml".equals(nomeArquivo)) {
            throw new IllegalArgumentException("Arquivo inválido.");
        }
    }
}
