package projeto.java.javacore.modificadorfinal.exercicio;

public final class Documento {
    private String titulo;
    private String autor;

    @Override
    public String toString() {
        return "Titulo do documento: " + this.titulo
                + "\nNome do Autor: " + this.autor;
    }

    public void exibirDocumento() {
        System.out.println(this.titulo);
        System.out.println(this.autor);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
