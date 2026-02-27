package projeto.java.javacore.Fmodificadorestatico.dominio;

public class ImprimeConfiguracao {
    public void imprimeConfig(Configuracao configuracao) {
        System.out.println("Verão do Sistema: " + configuracao.getVersaoSistema());
        System.out.println("Ambiente do sistema: " + configuracao.getAmbiente());
        System.out.println("Versão final do software: " + Configuracao.getConfigPadrao());
    }
}
