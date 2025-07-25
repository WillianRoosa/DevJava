package projeto.java.javacore.interfaces.exercicios;

public interface SensorTemperatura {
    double MAX_TEMPERATURA = 75.0;

    double lerTemperatura();

    default void verificarTemperatura() {
        double valor = lerTemperatura();
        if (valor > MAX_TEMPERATURA) {
            System.out.printf("⚠️ %.1f °C acima do limite! %n", valor);
        } else {
            System.out.printf("✅ %.1f °C dentro do limite! %n", valor);
        }
    }
}
