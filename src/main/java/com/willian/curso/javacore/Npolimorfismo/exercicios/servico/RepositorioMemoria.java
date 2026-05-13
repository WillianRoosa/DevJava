package com.willian.curso.javacore.Npolimorfismo.exercicios.servico;

import com.willian.curso.javacore.Npolimorfismo.exercicios.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em memória!");
    }
}
