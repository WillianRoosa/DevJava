package projeto.java.javacore.exception.error.test;

public class StckOverflowTest01 {
    public static void main(String[] args) {
        try {
            causarException();
        } catch (ArithmeticException e) {
            System.out.println("Pegamos a exceção: " + e.getMessage());
        }

        causarError();
    }

    public static void causarException() {
        int resultado = 10 / 0;
    }

    public static void causarError() {
        causarError();
    }
}
