package projeto.java.javacore.Fmodificadorestatico.dominio;

public class Servidor {
    private String nomeServidor;
    private static int servidorOnline = 0;

    static {
        System.out.println("Sistema de monitoramento de servidores iniciado...");
        System.out.println();
    }

    public Servidor(String nomeServidor) {
        this.nomeServidor = nomeServidor;
        servidorOnline++;
    }

    public void desligar() {
        if (servidorOnline > 0) {
            servidorOnline--;
            System.out.println("[" + this.nomeServidor + "]" + "- foi desligado");
        }
    }

    public String getNomeServidor() {
        return nomeServidor;
    }

    public static int getServidorOnline() {
        return Servidor.servidorOnline;
    }
}
