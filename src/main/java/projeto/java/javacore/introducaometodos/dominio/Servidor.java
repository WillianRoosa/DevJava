package projeto.java.javacore.introducaometodos.dominio;

public class Servidor {
    public String nomeServidor;
    private double[] temperaturas;
    private double mediaTemperatura;

    public void setTemperaturas(double[] temperatura) {
        this.temperaturas = temperatura;
        calculaMediaTemperatura();
    }

    public double[] getTemperaturas() {
        return temperaturas;
    }

    public double getMediaTemperatura() {
        return mediaTemperatura;
    }

    public void calculaMediaTemperatura() {
        if (temperaturas == null) {
            return;
        }

        mediaTemperatura = 0;
        for (double num : temperaturas) {
            mediaTemperatura += num;
        }
        mediaTemperatura /= temperaturas.length;
    }
}
