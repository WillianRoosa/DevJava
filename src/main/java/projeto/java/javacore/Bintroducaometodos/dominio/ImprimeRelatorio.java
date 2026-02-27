package projeto.java.javacore.Bintroducaometodos.dominio;

public class ImprimeRelatorio {
    public void relatorio(Servidor servidor) {
        System.out.println("Servidor -> " + servidor.nomeServidor);
        System.out.print("Temperaturas Registradas -> ");
        if (servidor.getTemperaturas() == null) {
            return;
        }
        for (double num : servidor.getTemperaturas()) {
            System.out.print(num + ", ");
        }
        // servidor.calculaMediaTemperatura();
        System.out.printf("\nMédia de temperatura -> %.2f%n", servidor.getMediaTemperatura());
    }
}
