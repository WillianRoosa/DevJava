package projeto.java.javacore.Jmodificadorfinal.test;

import projeto.java.javacore.Jmodificadorfinal.dominio.Carro;
import projeto.java.javacore.Jmodificadorfinal.dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.COMPRADOR.setNome("Willian Rosa");

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Enzo Ferrari");

        System.out.println(carro);
        ferrari.imprime();
    }
}
