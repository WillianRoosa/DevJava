import projeto.java.javacore.heranca.dominio.Endereco;
import projeto.java.javacore.heranca.dominio.Funcionario;
import projeto.java.javacore.heranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua das Laranjeiras");
        endereco.setCep("12345-678");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Gustavo da Silva");
        pessoa.setCpf("123.456.789-00");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Willian Vinicius da Rosa");
        funcionario.setCpf("987.654.321-00");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000.00);
        System.out.println("-------------------");
        funcionario.imprime();
    }
}
