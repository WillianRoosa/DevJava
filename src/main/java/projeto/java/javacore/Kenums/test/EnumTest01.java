package projeto.java.javacore.Kenums.test;

import projeto.java.javacore.Kenums.dominio.Cliente;
import projeto.java.javacore.Kenums.dominio.TipoCliente;
import projeto.java.javacore.Kenums.dominio.TipoPagamento;

import java.text.NumberFormat;
import java.util.Locale;

public class EnumTest01 {
    public static void main(String[] args) {
        Locale locale = new Locale("pt", "BR");
        NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);

        Cliente cliente1 = new Cliente("Willian Rosa", TipoCliente.PESSOA_JURIDICA);
        Cliente cliente2 = new Cliente("Alex Rosa", TipoCliente.PESSOA_FISICA);

        System.out.println(cliente1);
        System.out.println(cliente2);

        String formatValue1 = formatter.format(TipoPagamento.DEBITO.calcularDesconto(1000));
        String formatValue2 = formatter.format(TipoPagamento.CREDITO.calcularDesconto(1000));
        System.out.println("Calcular Desconto: " + formatValue1);
        System.out.println("Calcular Desconto: " + formatValue2);

        TipoCliente tipoCliente = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente);

        TipoCliente tipoCliente1 = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente1);
    }
}
