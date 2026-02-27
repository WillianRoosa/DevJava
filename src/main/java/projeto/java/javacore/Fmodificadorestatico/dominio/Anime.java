package projeto.java.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    /*
    * 0 - Bloco de inicialização é executado quando a JVM carregar a classe
    * 1 - Alocado espaço em memória para o objeto
    * 2 - Cada Atributo de classe é criado e inicializados com valores default ou com valores decididos
    * 3 - Bloco de inicialização é executado
    * 4 - Construtor é executado*/

    // Bloco de inicialização
    static {
        System.out.println("Dentro do bloco de inicialização estático 1");
        episodios = new int[50]; // Inicializa o array de episódios com 50 elementos
        // Preenche o array com números de 1 a 50
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    static {
        System.out.println("Dentro do bloco de inicialização estático 2");
    }

    {
        System.out.println("Dentro do bloco de inicialização não estático");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio : Anime.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return Anime.episodios;
    }
}
