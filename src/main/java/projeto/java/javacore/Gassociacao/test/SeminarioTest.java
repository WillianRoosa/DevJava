package projeto.java.javacore.Gassociacao.test;

import projeto.java.javacore.Gassociacao.exercicio.*;

import java.util.ArrayList;
import java.util.List;

public class SeminarioTest {
    public static void main(String[] args) {
        RelatorioSeminario relatorioSeminario = new RelatorioSeminario();
        Local local = new Local("Rua Volans - São José dos Campos - Sp");
        Local local1 = new Local("Rua projetada 11 - São Bento do Sapucaí - Sp");

        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Willian Rosa", 24));
        alunos.add(new Aluno("Alex Rosa", 31));
        alunos.add(new Aluno("Edson Rosa", 34));
        alunos.add(new Aluno("Regiane Rosa", 38));

        List<Aluno> alunos1 = new ArrayList<>();
        alunos1.add(new Aluno("Willian Rosa", 24));
        alunos1.add(new Aluno("Edson Rosa", 34));

        List<Professor> professores = new ArrayList<>();
        professores.add(new Professor("Willian Suane", "Java"));

        List<Professor> professores1 = new ArrayList<>();
        professores1.add(new Professor("Gustavo Guanabara", "Especialista em Tecnologia"));

        List<Seminario> seminarios = new ArrayList<>();
        seminarios.add(new Seminario("Aprenda Java do Zero ao avançado", alunos, local));

        List<Seminario> seminarios1 = new ArrayList<>();
        seminarios1.add(new Seminario("Aprenda MySql para uma carreira em dados", alunos1, local1));

        SistemaSeminario sistema = new SistemaSeminario();
        sistema.setSeminarios(seminarios);
        sistema.setProfessores(professores);

        SistemaSeminario sistema1 = new SistemaSeminario();
        sistema1.setSeminarios(seminarios1);
        sistema1.setProfessores(professores1);


        relatorioSeminario.gerarRelatorio(sistema);
        relatorioSeminario.gerarRelatorio(sistema1);
    }
}
