package projeto.java.javacore.Fmodificadorestatico.test;

import projeto.java.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 275);
        Carro c2 = new Carro("Mercedes-Benz", 300);
        Carro c3 = new Carro("Audi", 290);

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
