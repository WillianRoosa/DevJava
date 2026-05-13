package com.willian.curso.javacore.Gassociacao.test;

import com.willian.curso.javacore.Gassociacao.dominio.Curso;
import com.willian.curso.javacore.Gassociacao.dominio.ImprimeCurso;
import com.willian.curso.javacore.Gassociacao.dominio.Mentor;

public class CursoTest01 {
public static void main(String[] args) {
    Curso curso = new Curso("Maratona Java Virado no Jiraya");
    Mentor mentor = new Mentor("William Suane");
    curso.setMentor(mentor);

    ImprimeCurso impressora = new ImprimeCurso();
    impressora.imprimeCurso(curso);
}
}
