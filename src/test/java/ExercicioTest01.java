import projeto.java.javacore.heranca.exercicio2.Funcionario;
import projeto.java.javacore.heranca.exercicio2.Gerente;
import projeto.java.javacore.heranca.exercicio2.ImprimeDados;
import projeto.java.javacore.heranca.exercicio2.Loja;
import projeto.java.javacore.heranca.exercicio2.Vendedor;

public class ExercicioTest01 {
    public static void main(String[] args) {
        Loja loja = new Loja("Rede de supermercado Simpatia");

        Vendedor vendedor1 = new Vendedor("Willian Rosa", "902.457.093-02", "Rua das Dores", 2200.00, 1000.00);
        Vendedor vendedor2 = new Vendedor("Victor Augusto", "345.254.488-10", "Av Jorge Dias", 2500.00, 2000.00);
        Vendedor vendedor3 = new Vendedor("Rita Souza", "123.536.769-77", "Av Jardim Brasil", 2900.00, 3000.00);

        Gerente gerente = new Gerente("Sebastião Costa", "465.762.095-23", " Rua Cemitério", 10000.00);

        Vendedor[] vendedores = { vendedor1, vendedor2, vendedor3 };
        gerente.setVendedores(vendedores);

        Funcionario[] funcionarios = { vendedor1, vendedor2, vendedor3, gerente };
        loja.setFuncionarios(funcionarios);

        ImprimeDados dados = new ImprimeDados();
        dados.dadosLoja(loja);
        for (Funcionario funcionario : funcionarios) {
            dados.dadosFuncionarios(funcionario);
        }

        for (Vendedor vendedor : vendedores) {
            dados.dadosVendedor(vendedor);
        }
        dados.dadosGerente(gerente);
    }
}
