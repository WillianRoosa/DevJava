package projeto.java.javacore.Kenums.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    private final int ID;
    private String nomeRelatorio;

    TipoCliente(int id, String nomeRelatorio) {
        this.ID = id;
        this.nomeRelatorio = nomeRelatorio;
    }

    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio) {
        for (TipoCliente tipoCliente : values()) {
            if (tipoCliente.getNomeRelatorio().equalsIgnoreCase(nomeRelatorio)) {
                return tipoCliente;
            }
        }
        return null;
    }

    public int getID() {
        return ID;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}