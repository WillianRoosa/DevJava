package projeto.java.javacore.interfaces.exercicios;

public class Notebook implements Atualizavel{
    private String nome;

    public Notebook(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "nome = '" + nome + '\'' +
                '}';
    }


    @Override
    public void atualizar() {
        System.out.println("Atualizando versão de software...");
    }
}
