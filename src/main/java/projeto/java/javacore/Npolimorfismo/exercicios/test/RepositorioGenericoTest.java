package projeto.java.javacore.Npolimorfismo.exercicios.test;

import projeto.java.javacore.Npolimorfismo.exercicios.exercicio3.RepositorioApiExterna;
import projeto.java.javacore.Npolimorfismo.exercicios.exercicio3.RepositorioBanco;
import projeto.java.javacore.Npolimorfismo.exercicios.exercicio3.RepositorioMemoria;
import projeto.java.javacore.Npolimorfismo.exercicios.exercicio3.ServicoDePersistencia;

public class RepositorioGenericoTest {
    public static void main(String[] args) {
        ServicoDePersistencia servicoBanco = new ServicoDePersistencia(new RepositorioBanco());
        servicoBanco.executar("Dado A");

        System.out.println();

        ServicoDePersistencia servicoMemoria = new ServicoDePersistencia(new RepositorioMemoria());
        servicoMemoria.executar("Dado B");

        System.out.println();

        ServicoDePersistencia servicoApi = new ServicoDePersistencia(new RepositorioApiExterna());
        servicoApi.executar("Dado C");

        ServicoDePersistencia servico = new ServicoDePersistencia(new RepositorioMemoria());
        servico.executar("dado X");
        System.out.println();
        servico.executar("dado Y");
        System.out.println();
        servico.executar("dado Z");
        System.out.println();
    }
}
