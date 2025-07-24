package projeto.java.javacore.interfaces.exercicios;

public class SmartTv implements Atualizavel {
    private String nome;

    public SmartTv(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "SmartTv{" +
                "nome = '" + this.nome + '\'' +
                '}';
    }

    @Override
    public void atualizar() {
        System.out.println("Atualizando software SmartTv...");
    }
}
