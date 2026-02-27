package projeto.java.javacore.classesabstratas.test;

import projeto.java.javacore.classesabstratas.dominio.Desenvolvedor;
import projeto.java.javacore.classesabstratas.dominio.Gerente;

public class AbstractTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Roberto Rosa", 3500.00);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Willian Rosa", 12000.00);

        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
