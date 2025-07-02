package projeto.java.introducao;

public class Aula8ArrayMultidimensionais03 {
    public static void main(String[] args) {
        // Exercício 1 — Tabela de notas
        // Crie uma matriz double[][] com 3 alunos e 4 notas cada. Preencha os valores
        // manualmente. Depois, para cada aluno, calcule e imprima a média das notas.
        // Dica: você pode usar System.out.printf() para exibir com 1 casa decimal.

        double[][] aluno = new double[3][4];

        // Preenchendo manualmente as notas de cada aluno
        aluno[0] = new double[] { 6.0, 7.5, 8.0, 5.0 };
        aluno[1] = new double[] { 9.0, 8.0, 7.0, 6.0 };
        aluno[2] = new double[] { 5.5, 6.5, 7.5, 8.5 };

        // Percorre os alunos (linhas)
        for (int i = 0; i < aluno.length; i++) {
            double soma = 0;

            // soma as 4 notas do aluno i
            for (int j = 0; j < aluno[i].length; j++) {
                soma += aluno[i][j];
            }

            double media = soma / aluno[i].length;
            System.out.printf("Média do aluno %d: %.1f%n", i + 1, media);
        }

        System.out.println("----------------------");
        // Exercício 2 — Matriz identidade
        // Crie uma matriz int[][] de tamanho 3x3 que forme uma matriz identidade, ou
        // seja: 100, 010, 001
        // Depois imprima usando System.out.print() para mostrar em formato de tabela.

        int[][] matriz = new int[3][];

        matriz[0] = new int[] { 1, 0, 0 };
        matriz[1] = new int[] { 0, 1, 0 };
        matriz[2] = new int[] { 0, 0, 1 };

        for (int[] matrizIdentidade : matriz) {
            for (int num : matrizIdentidade) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        System.out.println("----------------------");
        // Exercício 3 — Tabela de meses do ano
        // Crie uma matriz String[][] com 4 linhas e 3 colunas, representando os 12
        // meses do ano (distribuídos por trimestre).
        // Imprima todos os meses, um por linha, indicando qual trimestre pertence.

        String[][] meses = new String[4][3];
        meses[0] = new String[] { "Janeiro", "Fevereiro", "Março" };
        meses[1] = new String[] { "Abril", "Maio", "Junho" };
        meses[2] = new String[] { "Julho", "Agosto", "Setembro" };
        meses[3] = new String[] { "Outubro", "Novembro", "Dezembro" };

        for (int i = 0; i < meses.length; i++) {
            System.out.println((i + 1) + "º Trimestre");
            for (int j = 0; j < meses[i].length; j++) {
                System.out.println(meses[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("----------------------");
        // Exercício 4 — Soma de elementos por linha
        // Crie uma matriz int[][] com 3 linhas e 3 colunas e preencha com os seguintes
        // valores: {3,5,7}, {1,6,2}, {8,4,9}
        // Depois, para cada linha, calcule e imprima a soma dos elementos.
        // saída esperada: linha 1: 15 | linha 2: 9 | linha 3: 21

        int[][] calculo = {
                { 3, 5, 7 },
                { 1, 6, 2 },
                { 8, 4, 9 }
        };

        int linha = 1; // Contador Manual para linha

        for (int[] linhaMatriz : calculo) {
            int soma = 0;

            for (int num : linhaMatriz) {
                soma += num;
            }
            System.out.printf("Linha %d: Soma = %d%n", linha, soma);
            linha++; // Incrementa o contador da linha
        }
    }
}
