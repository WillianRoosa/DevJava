package projeto.java.introducao;

public class Aula7Array03 {
    public static void main(String[] args) {
        /*
        Exercício 1: Soma dos valores de um array
        Crie um array de inteiros com os seguintes valores: {5, 10, 15, 20, 25}
        Use um foreach para somar todos os valores e imprimir a soma total no final.
         */
        int[] numbers = {5, 10, 15, 20, 25};
        int soma = 0;
        for (int num : numbers) {
            soma += num;
        }
        System.out.println("Soma total: " + soma);

        /*
        Exercício 2: Filtrar nomes com mais de 5 letras
        Crie um array de String com alguns nomes: {"Ana", "Roberto", "José", "Fernanda", "Leo"}
        Use um foreach para imprimir apenas os nomes que têm mais de 5 letras.
         */
        String[] nomes = {"Ana", "Roberto", "José", "Fernanda", "Willian"};
        for (String name:nomes){
            if (name.length() > 5){
                System.out.println(name);
            }
        }
    }
}