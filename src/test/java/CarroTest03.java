import projeto.java.javacore.modificadorfinal.dominio.Carro;
import projeto.java.javacore.modificadorfinal.dominio.Ferrari;

public class CarroTest03 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.COMPRADOR.setNome("Willian Rosa");

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Enzo Ferrari");

        System.out.println(carro);
        ferrari.imprime();
    }
}
