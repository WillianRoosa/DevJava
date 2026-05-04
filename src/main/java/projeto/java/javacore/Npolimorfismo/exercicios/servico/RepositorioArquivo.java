package projeto.java.javacore.Npolimorfismo.exercicios.servico;

import projeto.java.javacore.Npolimorfismo.exercicios.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no arquivo!");
    }
}
