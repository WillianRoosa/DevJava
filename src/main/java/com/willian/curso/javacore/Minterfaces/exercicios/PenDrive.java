package com.willian.curso.javacore.Minterfaces.exercicios;

public class PenDrive implements Salvavel {
    @Override
    public void salvar() {
        System.out.println("Salvando no PenDrive");
    }
}
