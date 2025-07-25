package projeto.java.javacore.interfaces.exercicios;

public class RestauradorDeSistema implements Carregavel {
    @Override
    public void carregar() {
        System.out.println("Carregando o RestauradorDeSistema");
    }
}
