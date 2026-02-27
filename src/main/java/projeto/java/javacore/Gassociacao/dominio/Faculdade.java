package projeto.java.javacore.Gassociacao.dominio;

public class Faculdade {
    private String nome;
    private Aluno[] alunos;

    public Faculdade(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }
}
