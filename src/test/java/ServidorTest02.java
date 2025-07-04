import projeto.java.javacore.modificadorestatico.dominio.ImprimeServidor;
import projeto.java.javacore.modificadorestatico.dominio.Servidor;

public class ServidorTest02 {
    public static void main(String[] args) {
        Servidor servidor1 = new Servidor("Rack-Sul");
        Servidor servidor2 = new Servidor("Rack-Leste");
        Servidor servidor3 = new Servidor("Rack-Oeste");

        servidor2.desligar();

        ImprimeServidor imprime = new ImprimeServidor();
        imprime.imprimeServidor(servidor1);
        imprime.imprimeServidor(servidor3);
    }
}
