import projeto.java.javacore.modificadorestatico.dominio.Configuracao;
import projeto.java.javacore.modificadorestatico.dominio.ImprimeConfiguracao;

public class ConfiguracaoTest01 {
    public static void main(String[] args) {
        Configuracao software = new Configuracao("Versão 1.0", "Produção");
        ImprimeConfiguracao impressora = new ImprimeConfiguracao();
        impressora.imprimeConfig(software);
    }
}
