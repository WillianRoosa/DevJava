package projeto.java.introducao;

public class Aula6EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        int valorMax = 50;
        for (int i = 0; i < valorMax; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }

        int value = 0;
        while (value < 100) {
            if (value > 50) {
                break;
            }
            System.out.println("Este é o value: " + value);
            value++;
        }

        int contador = 0;
        do {
            if (contador > 25) {
                break;
            }
            System.out.println("Este é o do-while -> " + contador);
            contador++;
        } while (contador <= 50);
    }
}
