import projeto.java.javacore.construtores.dominio.Aluno;
import projeto.java.javacore.construtores.dominio.DadosAluno;

public class AlunoTest02 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Willian Vinicius da Rosa", 23, "Engenharia de Software", "252.304.029-9");

        DadosAluno impressora = new DadosAluno();
        impressora.imprimeDadosAluno(aluno);
    }
}
