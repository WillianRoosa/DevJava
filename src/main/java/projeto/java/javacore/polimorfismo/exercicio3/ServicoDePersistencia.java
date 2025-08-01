package projeto.java.javacore.polimorfismo.exercicio3;

public class ServicoDePersistencia {
    private final RepositorioGenerico repositorio;

    public ServicoDePersistencia(RepositorioGenerico repositorio) {
        this.repositorio = repositorio;
    }

    public void executar(String dado) {
        repositorio.salvar(dado);
        repositorio.recuperar();

        if (repositorio instanceof RepositorioMemoria) {
            RepositorioMemoria memoria = (RepositorioMemoria) repositorio;
            System.out.println("Histórico de dados salvo em memória:");
            for (String item : memoria.getHistorio()) {
                System.out.println("- " + item);
            }
        }
    }
}
