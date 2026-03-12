package projeto.java.javacore.Jmodificadorfinal.exercicio;

public final class ConfigSistema {
    // Padrão de projetos Singleton Pattern
    private static final ConfigSistema INSTANCIA = new ConfigSistema();

    private ConfigSistema() {
        // construtor privado
    }

    public static ConfigSistema getINSTANCIA() {
        return INSTANCIA;
    }
}
