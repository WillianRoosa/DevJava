package projeto.java.javacore.polimorfismo.servico;

import projeto.java.javacore.polimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no banco de dados!");
    }
}
