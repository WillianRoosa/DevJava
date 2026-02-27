package projeto.java.javacore.Eblocosinicializacao.test;

import projeto.java.javacore.Eblocosinicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Dragon Ball GT");

        for (int episodio : anime.getEpisodios()) {
            System.out.print("Ep-" + episodio + " ");
        }
        System.out.println();
    }
}
