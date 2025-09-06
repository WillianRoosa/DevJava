package projeto.java.javacore.exception.exception.test;

import projeto.java.javacore.exception.exception.dominio.Biblioteca;
import projeto.java.javacore.exception.exception.dominio.Livro;
import projeto.java.javacore.exception.exception.dominio.LivroIndisponivelException;

public class BibliotecaTest {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Clean Code");
        Livro livro2 = new Livro("Effective Java");

        try {
            Biblioteca.emprestar(livro1);
        } catch (LivroIndisponivelException e) {
            System.out.println(e.getMessage());
        }

        try {
            Biblioteca.emprestar(livro2);
        } catch (LivroIndisponivelException e) {
            System.out.println(e.getMessage());
        }

        try {
            Biblioteca.emprestar(livro1);
        } catch (LivroIndisponivelException e) {
            System.out.println(e.getMessage());
        }
    }
}
