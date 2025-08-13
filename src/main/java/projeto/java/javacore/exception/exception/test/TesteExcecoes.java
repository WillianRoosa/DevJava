package projeto.java.javacore.exception.exception.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TesteExcecoes {
    public static void main(String[] args) {
        try {
            executarUnchecked();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("==> Essa é uma exceção UNCHECKED" + e.getMessage());
        }

        try {
            executarChecked();
        } catch (FileNotFoundException file) {
            System.out.println("==> Essa é uma exceção CHECKED" + file.getMessage());
        }
    }

    public static void executarUnchecked() {
        int[] valor = {1, 2, 3, 4};
        System.out.println(valor[10]);
    }

    public static void executarChecked() throws FileNotFoundException {
        FileReader reader = new FileReader(new File("teste.txt"));
        System.out.println(reader);
    }
}
