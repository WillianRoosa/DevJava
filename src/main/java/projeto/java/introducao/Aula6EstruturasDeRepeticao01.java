package projeto.java.introducao;

import java.util.Scanner;

public class Aula6EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for //
        int count = 20;
        while (count <= 10) {
            System.out.println(count);
            count++;
        }

        do {
            System.out.println("Dentro do Do-while");
        } while (count <= 10);

        for (int i = 0; i <= 10; i++) {
            System.out.println("For: " + i);
        }

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        int i = 10;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }

        // Usando o scanner com do-while //

        Scanner scan = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Digite um número (0 para sair): ");
            numero = scan.nextInt();
        } while (numero != 0);

        System.out.println("Programa encerrado.");
        scan.close();
    }
}



