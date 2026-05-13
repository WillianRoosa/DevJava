package com.willian.curso.javacore.Minterfaces.exercicios;

public class RestauradorDeSistema implements Carregavel {
    @Override
    public void carregar() {
        System.out.println("Carregando o RestauradorDeSistema");
    }
}
