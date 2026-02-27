package projeto.java.javacore.Fmodificadorestatico.dominio;

public class Configuracao {
    private String versaoSistema;
    private String ambiente;
    private static String configPadrão = "Versão 1.0 - Produção";

    static {
        System.out.println("----- Inicializando Software -----");
        
    }

    public Configuracao(String versaoSistema, String ambiente) {
        this.versaoSistema = versaoSistema;
        this.ambiente = ambiente;
    }

    public String getVersaoSistema() {
        return versaoSistema;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public static String getConfigPadrao() {
        return Configuracao.configPadrão;
    }
}
