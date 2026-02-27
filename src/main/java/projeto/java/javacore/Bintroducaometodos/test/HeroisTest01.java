package projeto.java.javacore.Bintroducaometodos.test;

import projeto.java.javacore.Bintroducaometodos.dominio.Herois;
import projeto.java.javacore.Bintroducaometodos.dominio.ImprimeHerois;

public class HeroisTest01 {
    public static void main(String[] args) {
        Herois heroi01 = new Herois();
        Herois heroi02 = new Herois();
        ImprimeHerois impressora = new ImprimeHerois();

        heroi01.nome = "Batman";
        heroi01.idade = 60;
        heroi01.sexo = 'M';

        heroi02.nome = "Alerquina";
        heroi02.idade = 25;
        heroi02.sexo = 'F';

        impressora.imprime(heroi01);
        impressora.imprime(heroi02);
    }
}
