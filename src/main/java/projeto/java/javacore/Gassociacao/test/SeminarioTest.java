package projeto.java.javacore.Gassociacao.test;

import projeto.java.javacore.Gassociacao.exercicio.*;

public class SeminarioTest {
    public static void main(String[] args) {
        ImprimeSeminario imprimeSeminario = new ImprimeSeminario();
        Local local = new Local("Rua Volans - São José dos Campos - Sp");
        Aluno aluno = new Aluno("Willian Rosa", 24);
        Aluno aluno2 = new Aluno("José Roberto", 30);
        Professor professor = new Professor("William Suane", "Java");
        Aluno[] alunosParaSeminario = {aluno, aluno2};
        Seminario seminario = new Seminario("Aprenda Programar em Java do Zero ao Avançado", alunosParaSeminario, local);
        aluno.setSeminario(seminario);
        aluno2.setSeminario(seminario);
        Seminario[] seminariosAtivos = {seminario};

        professor.setSeminarios(seminariosAtivos);
        imprimeSeminario.impressora(professor);
    }
}
