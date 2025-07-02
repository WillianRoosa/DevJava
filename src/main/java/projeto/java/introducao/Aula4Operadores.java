package projeto.java.introducao;

public class Aula4Operadores {
    public static void main(String[] args) {
        // + - / * //
        int valor1 = 10;
        double valor2 = 20;
        double resultado = valor1 / valor2;

        System.out.println(resultado);

        // rest -> % //
        int resto = 21 % 5;
        System.out.println(resto);

        /*
         * < menor
         * > maior
         * ! negação
         * <= menor ou igual
         * >= maior ou igual
         * == igualdade
         * != Diferente
         */

        boolean isDezMaiorQueVinte = 10 > 20;

        System.out.println("isDEzMaiorQueVinte " + isDezMaiorQueVinte);

        // Operadores lógicos -> && (AND), || (OR), ! //
        int idade = 25;
        float salario = 3500;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        double valorContaCorrente = 500;
        double valorContaPoupanca = 10000;
        float valorPlaystation = 5000;
        boolean comprarPlaystationCinco = valorContaCorrente > valorPlaystation
                || valorContaPoupanca > valorPlaystation;

        System.out.println("Posso comprar o playstation 5: " + comprarPlaystationCinco);

        // Operadores de atribuição -> = += -= *= /= %= //
        double bonus = 1800;
        bonus += 1000;
        bonus -= 800;
        bonus *= 2;
        bonus /= 4;
        bonus %= 5;

        System.out.println(bonus);

        // contadores ++ -- //
        int contador = 0;
        contador += 1; // contador = contador + 1 //
        contador++;

        System.out.println(contador);
    }
}
