package projeto.java.javacore.Oexception.exception.test;

import projeto.java.javacore.Oexception.exception.dominio.Biblioteca;
import projeto.java.javacore.Oexception.exception.dominio.Livro;
import projeto.java.javacore.Oexception.exception.dominio.LivroIndisponivelException;

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
