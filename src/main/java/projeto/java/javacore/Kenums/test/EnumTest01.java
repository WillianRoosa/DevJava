package projeto.java.javacore.Kenums.test;

import projeto.java.javacore.Kenums.dominio.Cliente;
import projeto.java.javacore.Kenums.dominio.TipoCliente;
import projeto.java.javacore.Kenums.dominio.TipoPagamento;

public class EnumTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Willian Rosa", TipoCliente.PESSOA_JURIDICA);
        Cliente cliente2 = new Cliente("Alex Rosa", TipoCliente.PESSOA_FISICA);
        
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(1000));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(1000));

        TipoCliente tipoCliente = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente);

        TipoCliente tipoCliente1 = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente1);
    }
}
