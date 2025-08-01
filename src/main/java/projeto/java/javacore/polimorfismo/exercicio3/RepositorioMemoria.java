package projeto.java.javacore.polimorfismo.exercicio3;

import java.util.ArrayList;
import java.util.List;

public class RepositorioMemoria implements RepositorioGenerico {
    private String dado;
    private final List<String> historio = new ArrayList<>();

    @Override
    public void salvar(String dado) {
        this.dado = dado;
        System.out.println("Salvando em memória: " + dado);
    }

    @Override
    public String recuperar() {
        System.out.println("Recuperando da memória: " + dado);
        return dado;
    }

    public List<String> getHistorio(){
        return historio;
    }
}
