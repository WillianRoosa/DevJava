package projeto.java.javacore.modificadorfinal.dominio;

public class Carro {
    private String nome = "Ferrari";
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();

    @Override
    public String toString() {
        return "Nome do Carro: " + this.nome
                + "\nVelocidade MÁX: " + Carro.VELOCIDADE_LIMITE + " KM"
                + "\nComprador " + this.COMPRADOR;
    }

    public final void imprime() {
        System.out.println(this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
