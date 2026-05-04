package projeto.java.javacore.Npolimorfismo.exercicios.servico;

import projeto.java.javacore.Npolimorfismo.exercicios.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em memória!");
    }
}
