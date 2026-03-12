package projeto.java.javacore.Gassociacao.exercicio;

public class RelatorioSeminario {
    public void gerarRelatorio(SistemaSeminario sistema) {
        System.out.println("--- BEM-VINDO AO SEMINÁRIO ---");
        relatorioProfessor(sistema);
    }

    private void relatorioProfessor(SistemaSeminario sistema) {
        if (sistema.getSeminarios().isEmpty()) {
            System.out.println("Não existe seminário cadastrado!");
            System.out.println("------------------------------");
            return;
        }
        for (Seminario seminario : sistema.getSeminarios()) {
            System.out.println("Seminário ativo: " + seminario.getTitulo());
            System.out.println("Local: " + seminario.getLocal().getEndereco());


            if (sistema.getProfessores().isEmpty()) {
                System.out.println("Seminário sem professor cadastrado!");
                System.out.println("------------------------------");
                continue;
            }
            for (Professor professor : sistema.getProfessores()) {
                System.out.println("Professor: " + professor.getNome() + " - Especialidade: " + professor.getEspecialidade());
            }
            relatorioSeminario(seminario);
        }
    }

    private void relatorioSeminario(Seminario seminario) {
        if (seminario.getAlunos().isEmpty()) {
            System.out.println("Não possui aluno neste seminário!");
            System.out.println("------------------------------");
            return;
        }
        System.out.println("--- ALUNOS CADASTRADOS ---");
        for (Aluno aluno : seminario.getAlunos()) {
            relatorioAluno(aluno);
        }
        System.out.println("------------------------------");
    }

    private void relatorioAluno(Aluno aluno) {
        System.out.println("Aluno: " + aluno.getNome() + " - " + aluno.getIdade() + " anos");
    }
}
