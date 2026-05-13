package com.willian.curso.javacore.Bintroducaometodos.test;

import com.willian.curso.javacore.Bintroducaometodos.dominio.Estudante;
import com.willian.curso.javacore.Bintroducaometodos.dominio.ImprimeEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImprimeEstudante impressora = new ImprimeEstudante();

        estudante01.nome = "Willian";
        estudante01.idade = 23;
        estudante01.sexo = 'M';

        estudante02.nome = "Vinicius";
        estudante02.idade = 24;
        estudante02.sexo = 'M';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
    }
}