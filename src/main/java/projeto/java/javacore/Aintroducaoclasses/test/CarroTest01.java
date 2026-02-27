package projeto.java.javacore.Aintroducaoclasses.test;

import projeto.java.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.marca = "Chevrolet";
        carro.modelo = "Camaro";
        carro.ano = 2024;

        System.out.println(carro.marca);
        System.out.println(carro.modelo);
        System.out.println(carro.ano);
    }
}
