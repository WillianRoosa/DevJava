package projeto.java.javacore.polimorfismo.test;

import projeto.java.javacore.polimorfismo.exercicio3.*;

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
