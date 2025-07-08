package projeto.java.javacore.associacao.dominio;

public class ImprimeFaculdade {
    public void imprimeFaculdade(Faculdade faculdade) {
        System.out.println("--- Faculdade ---");
        System.out.println(faculdade.getNome());
        if (faculdade.getAlunos() == null) {
            return;
        }
        for (Aluno alunos : faculdade.getAlunos()) {
            System.out.println("Alunos -> " + alunos.getNome());
        }
    }

    public void imprimeAlunos(Aluno aluno) {
        System.out.println();
        System.out.println("--- Alunos ---");
        System.out.println("Aluno -> " + aluno.getNome());
        if (aluno.getFaculdade() != null) {
            System.out.println("Faculdade-> " + aluno.getFaculdade().getNome());
        }
    }
}
