package projeto.java.javacore.polimorfismo.exercicio3;

public class RepositorioApiExterna implements RepositorioGenerico {
    private String dado;

    @Override
    public void salvar(String dado) {
        this.dado = dado;
        System.out.println("Salvando via API externa: " + dado);
    }

    @Override
    public String recuperar() {
        System.out.println("Recuperando via API externa: " + dado);
        return dado;
    }
}
