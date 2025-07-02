import projeto.java.javacore.introducaometodos.dominio.ImprimeRelatorio;
import projeto.java.javacore.introducaometodos.dominio.Servidor;

public class ServidorTest01 {
    public static void main(String[] args) {
        Servidor servidor1 = new Servidor();
        servidor1.nomeServidor = "Rack-Sul";
        servidor1.setTemperaturas(new double[] { 25.5, 27.0, 26.1 });

        Servidor servidor2 = new Servidor();
        servidor2.nomeServidor = "Rack-Norte";
        servidor2.setTemperaturas(new double[] { 30.0, 32.5, 29.8 });

        ImprimeRelatorio impressora = new ImprimeRelatorio();
        impressora.relatorio(servidor1);
        impressora.relatorio(servidor2);
    }
}
