package projeto.java.javacore.interfaces.exercicios;

public class Celular implements Atualizavel {
    private String nome;

    public Celular(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar() {
        System.out.println("Atualização de software Celular...");
    }

    @Override
    public String toString() {
        return "Celular{" +
                "nome = '" + nome + '\'' +
                '}';
    }
}
