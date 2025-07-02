import projeto.java.javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int a = 1;
        int b = 2;
        calculadora.alteraDoisNumeros(a, b);

        System.out.println("Dentro do CalculadoraTest02");
        System.out.println("Num1 " + a);
        System.out.println("Num2 " + b);
    }
}
