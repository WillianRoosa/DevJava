package projeto.java.javacore.Bintroducaometodos.dominio;

public class ImprimeBoletim {
    public void boletim(Aluno aluno) {
        System.out.println("Nome do Aluno: " + aluno.nomeAluno);
        System.out.println("Notas do Aluno: ");
        if (aluno.notas == null) {
            return;
        }

        for (double num : aluno.notas) {
            System.out.print(num + ", ");
        }
        aluno.aplicaMedia();
        System.out.println("\nMédia Final: " + aluno.getMedia());
    }
}
