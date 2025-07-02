import projeto.java.javacore.introducaoclasses.dominio.Livro;

public class LivroTest01 {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.titulo = "Código Limpo";
        livro.autor = "Robert Cecil Martin";
        livro.preco = 95.00;

        System.out.println("Nome do Livro: " + livro.titulo + "\nAutor do livro: " + livro.autor + "\nPreço do Livro: "
                + livro.preco);
    }
}
