package projeto.java.javacore.exception.exception.dominio;

public class Livro {
    String titulo;
    boolean disponivel;

    public Livro(String titulo) {
        this.titulo = titulo;
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
