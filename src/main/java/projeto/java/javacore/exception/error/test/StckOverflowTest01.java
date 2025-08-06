package projeto.java.javacore.exception.error.test;

public class StckOverflowTest01 {
    public static void main(String[] args) {
        metodoRecursivo();
    }

    public static void metodoRecursivo() {
        metodoRecursivo(); // chama ele mesmo para sempre
    }
}
