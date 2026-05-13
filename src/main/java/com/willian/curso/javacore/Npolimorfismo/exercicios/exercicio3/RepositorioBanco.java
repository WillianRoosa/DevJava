package com.willian.curso.javacore.Npolimorfismo.exercicios.exercicio3;

public class RepositorioBanco implements RepositorioGenerico {
    private String dado;
    @Override
    public void salvar(String dado) {
        this.dado = dado;
        System.out.println("Salvando no banco de dados: " + dado);
    }

    @Override
    public String recuperar() {
        System.out.println("Recuperando do banco de dados: " + dado);
        return dado;
    }
}
