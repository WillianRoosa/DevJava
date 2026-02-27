package projeto.java.javacore.enums.test;

import projeto.java.javacore.enums.dominio.Cliente;
import projeto.java.javacore.enums.dominio.TipoCliente;
import projeto.java.javacore.enums.dominio.TipoPagamento;

public class EnumTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Willian Rosa", TipoCliente.PESSOA_JURIDICA);
        Cliente cliente2 = new Cliente("Alex Rosa", TipoCliente.PESSOA_FISICA);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(1000));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(1000));

        TipoCliente cliente = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
        System.out.println(cliente);

        TipoCliente clientes = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(clientes);
    }
}
