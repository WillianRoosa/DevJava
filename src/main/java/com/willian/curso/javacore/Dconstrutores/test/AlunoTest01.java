package com.willian.curso.javacore.Dconstrutores.test;

import com.willian.curso.javacore.Dconstrutores.dominio.Aluno;
import com.willian.curso.javacore.Dconstrutores.dominio.DadosAluno;

public class AlunoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Willian Vinicius da Rosa", 23, "Engenharia de Software", "252.304.029-9");

        DadosAluno impressora = new DadosAluno();
        impressora.imprimeDadosAluno(aluno);
    }
}
