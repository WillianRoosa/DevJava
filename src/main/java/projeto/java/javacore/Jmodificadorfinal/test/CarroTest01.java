package projeto.java.javacore.Jmodificadorfinal.test;

import projeto.java.javacore.Jmodificadorfinal.dominio.Carro;
import projeto.java.javacore.Jmodificadorfinal.dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setNome("Ferrari 611");
        carro.COMPRADOR.setNome("Willian Rosa");

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Enzo Ferrari");

        System.out.println(carro);
        ferrari.imprime();

        System.out.println("=========");

        Carro carro1 = new Carro();
        carro1.setNome("Ferrari PuroSangue");
        carro1.COMPRADOR.setNome("Vinicius Rosa");

        Ferrari ferrari1 = new Ferrari();
        ferrari1.setNome("Ferrari Puro Sangue");

        System.out.println(carro1);
        ferrari1.imprime();
    }
}
