package projeto.java.javacore.modificadorfinal.dominio;

public class Comprador {
    private String nome;

    public String toString() {
        return "Nome: " + this.nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
