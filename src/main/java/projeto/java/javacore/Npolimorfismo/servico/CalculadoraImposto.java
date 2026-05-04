package projeto.java.javacore.Npolimorfismo.servico;

import projeto.java.javacore.Npolimorfismo.dominio.Produto;
import projeto.java.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void impostoProduto(Produto produto) {
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
        if (produto instanceof Tomate){
            String dataValidade = ((Tomate) produto).getDataValidade();
            System.out.println("Validade: "+ dataValidade);
        }
    }
}
