package projeto.java.javacore.Npolimorfismo.exercicios.test;

import projeto.java.javacore.Npolimorfismo.exercicios.repositorio.Repositorio;
import projeto.java.javacore.Npolimorfismo.exercicios.servico.RepositorioArquivo;
import projeto.java.javacore.Npolimorfismo.exercicios.servico.RepositorioBancoDeDados;
import projeto.java.javacore.Npolimorfismo.exercicios.servico.RepositorioMemoria;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioArquivo();
        Repositorio repositorio1 = new RepositorioBancoDeDados();
        Repositorio repositorio2 = new RepositorioMemoria();

        repositorio.salvar();
        repositorio1.salvar();
        repositorio2.salvar();
    }
}
