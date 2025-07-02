import projeto.java.javacore.blocosinicializacao.dominio.Anime;

public class AnimeTest03 {
    public static void main(String[] args) {
        Anime anime = new Anime("Dragon Ball GT");

        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }
}
