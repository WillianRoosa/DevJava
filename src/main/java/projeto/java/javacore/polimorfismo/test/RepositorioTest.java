package projeto.java.javacore.polimorfismo.test;

import projeto.java.javacore.polimorfismo.repositorio.Repositorio;
import projeto.java.javacore.polimorfismo.servico.RepositorioArquivo;
import projeto.java.javacore.polimorfismo.servico.RepositorioBancoDeDados;
import projeto.java.javacore.polimorfismo.servico.RepositorioMemoria;

import java.util.LinkedList;
import java.util.List;

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
