package projeto.java.javacore.associacao.dominio;

public class Curso {
    private String nome;
    private Mentor mentor;

    public Curso(String nome) {
        this.nome = nome;
    }

    public Curso(String nome, Mentor mentor) {
        this(nome);
        this.mentor = mentor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }

    public Mentor getMentor() {
        return mentor;
    }
}
