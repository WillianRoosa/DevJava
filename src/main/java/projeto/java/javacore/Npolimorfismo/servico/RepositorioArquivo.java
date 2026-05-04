package projeto.java.javacore.Npolimorfismo.servico;

import projeto.java.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no arquivo!");
    }
}
