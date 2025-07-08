package projeto.java.javacore.associacao.dominio;

public class Aluno {
    private String nome;
    private Faculdade faculdade;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setFaculdade(Faculdade faculdade) {
        this.faculdade = faculdade;
    }

    public Faculdade getFaculdade() {
        return faculdade;
    }
}
