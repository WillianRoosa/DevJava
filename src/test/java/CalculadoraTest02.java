import projeto.java.javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int a = 1;
        int b = 2;
        calculadora.alteraDoisNumeros(a, b);

        System.out.println("\nDentro do CalculadoraTest02");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
