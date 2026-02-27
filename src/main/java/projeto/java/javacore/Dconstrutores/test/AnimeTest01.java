package projeto.java.javacore.Dconstrutores.test;

import projeto.java.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Dragon Ball Z", "TV", 120, "Ação/Luta", "Toei Animation");

        anime.imprime();
    }
}
