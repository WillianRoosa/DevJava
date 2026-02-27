package projeto.java.javacore.Dconstrutores.dominio;

public class DadosAluno {
    public void imprimeDadosAluno(Aluno aluno) {
        System.out.println("Nome do Aluno: " + aluno.getNomeAluno());
        System.out.println("Idade do Aluno: " + aluno.getIdade());
        System.out.println("Curso: " + aluno.getCurso());
        System.out.println("Matrícula: " + aluno.getMatricula());
    }
}
