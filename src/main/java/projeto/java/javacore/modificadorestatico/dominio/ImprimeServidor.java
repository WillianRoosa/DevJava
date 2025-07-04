package projeto.java.javacore.modificadorestatico.dominio;

public class ImprimeServidor {
    public void imprimeServidor(Servidor servidor) {
        System.out.println();
        System.out.println("Nome do Servidor -> " + servidor.getNomeServidor());
        System.out.println("Servidores Online -> " + Servidor.getServidorOnline());
    }
}
