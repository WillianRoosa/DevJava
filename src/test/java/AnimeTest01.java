import projeto.java.javacore.sobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Dragon Ball Z", "TV", 120, "Ação/Luta");
        anime.imprime();
    }
}
