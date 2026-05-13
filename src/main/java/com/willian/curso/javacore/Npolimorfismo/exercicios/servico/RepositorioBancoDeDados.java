package com.willian.curso.javacore.Npolimorfismo.exercicios.servico;

import com.willian.curso.javacore.Npolimorfismo.exercicios.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no banco de dados!");
    }
}
