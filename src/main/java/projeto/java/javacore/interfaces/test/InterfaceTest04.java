package projeto.java.javacore.interfaces.test;

import projeto.java.javacore.interfaces.exercicios.SensorSala;
import projeto.java.javacore.interfaces.exercicios.SensorServidor;
import projeto.java.javacore.interfaces.exercicios.SensorTemperatura;

public class InterfaceTest04 {
    public static void main(String[] args) {
        System.out.println("--- SensorTemperatura ---");
        System.out.println("Temperatura Limite -> " + SensorTemperatura.MAX_TEMPERATURA);

        SensorSala sensorSala = new SensorSala();
        System.out.println("--- SensorSala ---");
        System.out.println("Temperatura -> " + sensorSala.lerTemperatura());
        sensorSala.verificarTemperatura();

        SensorServidor sensorServidor = new SensorServidor();
        System.out.println("--- SensorServidor ---");
        System.out.println("Temperatura -> " + sensorServidor.lerTemperatura()
        );
        sensorServidor.verificarTemperatura();

    }
}
