package projeto.java.javacore.blocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    // Bloco de inicialização
    {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[50]; // Inicializa o array de episódios com 50 elementos
        // Preenche o array com números de 1 a 50
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }             

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio : this.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
