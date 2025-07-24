import projeto.java.javacore.interfaces.exercicios.Atualizavel;
import projeto.java.javacore.interfaces.exercicios.Celular;
import projeto.java.javacore.interfaces.exercicios.Notebook;
import projeto.java.javacore.interfaces.exercicios.SmartTv;

public class InterfaceTest02 {
    public static void main(String[] args) {
        Celular celular = new Celular("Iphone 14 Pro");

        System.out.println("--- Celular ---");
        System.out.println(celular);
        celular.atualizar();
        celular.verificarConexao();
        System.out.println();

        Notebook notebook = new Notebook("Macbook Air M1 Pro");

        System.out.println("--- Notebook ---");
        System.out.println(notebook);
        notebook.atualizar();
        notebook.verificarConexao();
        System.out.println();

        SmartTv smartTv = new SmartTv("Samsung Smart PRO");

        System.out.println("--- SmartTv ---");
        System.out.println(smartTv);
        smartTv.atualizar();
        smartTv.verificarConexao();
        System.out.println();

        Atualizavel.mostrarVersaoSistema();
    }
}
