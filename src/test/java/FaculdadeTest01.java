import projeto.java.javacore.associacao.dominio.Aluno;
import projeto.java.javacore.associacao.dominio.Faculdade;
import projeto.java.javacore.associacao.dominio.ImprimeFaculdade;

public class FaculdadeTest01 {
    public static void main(String[] args) {
        Faculdade faculdade = new Faculdade("Engenharia de Software");

        Aluno aluno1 = new Aluno("Regiane Aparecida da Rosa");
        Aluno aluno2 = new Aluno("José Roberto da Rosa");
        Aluno aluno3 = new Aluno("Maria Zelia da Rosa");
        Aluno[] alunos = new Aluno[] { aluno1, aluno2, aluno3 };

        aluno1.setFaculdade(faculdade);
        aluno2.setFaculdade(faculdade);
        aluno3.setFaculdade(faculdade);
        faculdade.setAlunos(alunos);

        ImprimeFaculdade impressora = new ImprimeFaculdade();
        impressora.imprimeFaculdade(faculdade);
        impressora.imprimeAlunos(aluno1);
        impressora.imprimeAlunos(aluno2);
        impressora.imprimeAlunos(aluno3);
    }
}
