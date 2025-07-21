import projeto.java.javacore.enums.dominio.Cliente;
import projeto.java.javacore.enums.dominio.TipoCliente;

public class EnumTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Willian Rosa", TipoCliente.PESSOA_JURIDICA);
        Cliente cliente2 = new Cliente("Alex Rosa", TipoCliente.PESSOA_FISICA);
        Cliente cliente3 = new Cliente("Edson Rosa", TipoCliente.PESSOA_FISICA);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
    }
}
