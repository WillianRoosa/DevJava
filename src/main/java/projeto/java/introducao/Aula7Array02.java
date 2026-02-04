package projeto.java.introducao;

public class Aula7Array02 {
    public static void main(String[] args) {
        /*
        byte, short, int, long, float e double: padrão é 0
        char: padrão é '\u0000' '    '
        boolean: padrão é false
        String: padrão é null
         */
        String[] nomes = new String[4];
        nomes[0] = "Batman";
        nomes[1] = "Flash";
        nomes[2] = "Lanterna Verde";
        nomes[3] = "Super-Man";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        /*
        Exercício 1 – Armazenando números inteiros
        Crie um array com 5 números inteiros e imprima todos os elementos multiplicados por 2.
        Regras:
        Use int[]
        Use for tradicional com índices
         */
        int[] numeros = new int[5];
        numeros[0] = 2;
        numeros[1] = 4;
        numeros[2] = 6;
        numeros[3] = 8;
        numeros[4] = 10;

        for (int i = 0; i < numeros.length; i++) {
            int resultado = numeros[i] * 2;
            System.out.println(resultado);
        }

        /*
        Exercício 2 – Somando elementos
        Crie um array de double com 4 notas. Some todas e calcule a média.
        Regras:
        Use double[]
        Percorra com for tradicional
        imprima: cada nota, a soma, a média
         */
        double[] notas = new double[4];
        notas[0] = 2.0;
        notas[1] = 4.0;
        notas[2] = 7.0;
        notas[3] = 10.0;

        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
            soma += notas[i]; // Acumula a soma das notas //
        }

        double media = soma / notas.length;

        System.out.println("Soma total das notas: " + soma);
        System.out.println("Média Final: " + media);

        /*
        Exercício 3 – Contando palavras específicas
        Crie um array de String com 6 nomes. Conte quantos desses nomes começam com a letra A.
        Use String []
        Use nome.charAt(0) == 'A' para checar a primeira letra
         */
        String[] herois = new String[6];
        herois[0] = "Aquamen";
        herois[1] = "Lanterna Verde";
        herois[2] = "Batman";
        herois[3] = "Arqueiro Verde";
        herois[4] = "Flash";
        herois[5] = "Gavião Arqueiro";

        for (int i = 0; i < herois.length; i++) {
            String nomeHeroi = herois[i];

            if (nomeHeroi.charAt(0) == 'A') {
                System.out.println("Esses são os Heróis com a letra A: " + nomeHeroi);
            }
        }

        /*
        Exercício 4 – Invertendo a ordem
        Crie um array de 5 nomes e imprima-os na ordem inversa.
        Exemplo: String[] nomes = {"João", "Maria", "Ana", "Pedro", "Lucas"};
        Saída esperada: Lucas, Pedro, Ana, Maria, João
         */
        String[] sobreNome = new String[5];
        sobreNome[0] = "João";
        sobreNome[1] = "Maria";
        sobreNome[2] = "Ana";
        sobreNome[3] = "Pedro";
        sobreNome[4] = "Lucas";

        for (int i = sobreNome.length - 1; i >= 0; i--) {
            System.out.println("Retornando ao Contrário: " + sobreNome[i]);
        }

        /*
        Exercício 5 – Substituindo valores
        Crie um array com 6 números inteiros. Substitua os números pares por 0 e imprima o novo array.
         */
        int[] number = new int[6];
        number[0] = 3;
        number[1] = 7;
        number[2] = 10;
        number[3] = 13;
        number[4] = 15;
        number[5] = 20;

        for (int i = 0; i < number.length; i++) {
            // Se o número for par (divisível por 2), zera o valor //
            if (number[i] % 2 == 0) {
                number[i] = 0;
            }
        }
        // Imprime todos os valores (os pares aparecerão como 0) //
        for (int i = 0; i < number.length; i++) {
            System.out.println("Números Finais: " + number[i]);
        }
    }
}
