import projeto.java.javacore.construtores.dominio.ImprimeDadosProduto;
import projeto.java.javacore.construtores.dominio.Produto;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Monitor LG Ultraguear 34p Curvo", 2200.00, 20, "Monitores");
        Produto produto2 = new Produto("Mouse Logitech G502", 350.00, 50, "Periféricos");

        ImprimeDadosProduto imprime = new ImprimeDadosProduto();
        imprime.imprimeDados(produto1);
        imprime.imprimeDados(produto2);
    }
}
