import projeto.java.javacore.introducaometodos.dominio.Aluno;
import projeto.java.javacore.introducaometodos.dominio.ImprimeBoletim;

public class AlunoTest01 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nomeAluno = "Willian Vinicius da Rosa";
        aluno1.notas = new double[] { 7.0, 6.5, 10.0 };
        aluno1.getMedia();

        ImprimeBoletim imprime = new ImprimeBoletim();
        imprime.boletim(aluno1);
    }
}
