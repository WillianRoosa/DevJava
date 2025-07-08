package projeto.java.javacore.associacao.dominio;

public class Atleta {
    private String nome;
    private Equipe equipe;

    public Atleta(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    public Equipe getEquipe() {
        return equipe;
    }
}
