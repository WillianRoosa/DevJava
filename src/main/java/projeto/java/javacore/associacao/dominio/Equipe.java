package projeto.java.javacore.associacao.dominio;

public class Equipe {
    private String nome;
    private Atleta[] atletas;

    public Equipe(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setAtletas(Atleta[] atletas) {
        this.atletas = atletas;
    }

    public Atleta[] getAtletas() {
        return atletas;
    }
}
