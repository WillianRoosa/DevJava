package projeto.java.introducao;

public class Aula6EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Parcela: " + parcela + " R$ " + valorParcela);
        }

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                continue;
            }
            if (i == 17) {
                break;
            }
            System.out.println(i);
        }

        for (int j = 1; j <= 100; j++) {
            if (j % 5 == 0) {
                continue;
            }
            if (j % 23 == 0) {
                break;
            }
            System.out.println(j);
        }

        for (int a = 1; a <= 50; a++) {
            if (a % 2 == 0) {
                continue;
            }
            if (a > 35) {
                break;
            }
            System.out.println(a);
        }

        int b = 0;
        while (b <= 100) {
            if (b >= 30 && b <= 40) {
                b++;
                continue;
            }
            if (b >= 90) {
                break;
            }
            System.out.println(b);
            b++;
        }
    }
}
