package projeto.java.javacore.Gassociacao.exercicio;

public class ImprimeSeminario {
    public void impressora(Professor professor) {
        System.out.println("--- BEM-VINDO AO SEMINÁRIO ---");
        System.out.println("Professor: " + professor.getNome());
        if (professor.getSeminarios() == null) {
            return;
        }
        for (Seminario seminario : professor.getSeminarios()) {
            System.out.println("Seminário ativo: " + seminario.getTitulo());
            System.out.println("Local: " + seminario.getLocal().getEndereco());
            if (seminario.getAlunos() == null) {
                continue;
            }
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println("Alunos cadastrados: " + aluno.getNome() + " - " + aluno.getIdade() + " anos");
            }
        }
    }
}
