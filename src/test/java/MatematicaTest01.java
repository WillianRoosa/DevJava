import projeto.java.javacore.introducaometodos.dominio.Matematica;

public class MatematicaTest01 {
public static void main(String[] args) {
    Matematica matematica = new Matematica();

    double retorno = matematica.multiplica(20.5, 10.02);

    System.out.println(retorno);
}
}
