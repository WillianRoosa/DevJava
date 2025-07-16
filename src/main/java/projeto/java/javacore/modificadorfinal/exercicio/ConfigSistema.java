package projeto.java.javacore.modificadorfinal.exercicio;

public final class ConfigSistema {
    private static final ConfigSistema INSTANCIA = new ConfigSistema();

    public static ConfigSistema getINSTANCIA() {
        return INSTANCIA;
    }
}
