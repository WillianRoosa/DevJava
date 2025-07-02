package projeto.java.javacore.construtores.dominio;

public class Aluno {
    private String nomeAluno;
    private int idade;
    private String curso;
    private String matricula;

    public Aluno(String nomeAluno, String curso) {
        this.nomeAluno = nomeAluno;
        this.curso = curso;
    }

    public Aluno(String nomeAluno, int idade, String curso, String matricula) {
        this(nomeAluno, curso);
        this.idade = idade;
        this.matricula = matricula;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public int getIdade() {
        return idade;
    }

    public String getCurso() {
        return curso;
    }

    public String getMatricula() {
        return matricula;
    }
}
