package projeto.java.javacore.polimorfismo.servico;

import projeto.java.javacore.polimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no arquivo!");
    }
}
