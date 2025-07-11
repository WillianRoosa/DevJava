import projeto.java.javacore.heranca.exercicio.Empresa;
import projeto.java.javacore.heranca.exercicio.Funcionario;
import projeto.java.javacore.heranca.exercicio.ImprimeDados02;

public class HerancaTest03 {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("David da Silva", "987.654.321-00",
                "Rua das Laranjeiras", "98765-432", 2200.00);
        Funcionario funcionario2 = new Funcionario("Willian Rosa", "123.456.789-00", "Bosque dos Eucáliptos",
                "12345-678", 10000.00);
        Funcionario funcionario3 = new Funcionario("Robert de Souza", "092.456.967-20", "Avenida das Granjas",
                "12345-678", 30000.00);

        Funcionario[] funcionarios = { funcionario1, funcionario2, funcionario3 };

        Empresa empresa = new Empresa("CodeLab IA");

        empresa.setFuncionarios(funcionarios);

        ImprimeDados02 imprime = new ImprimeDados02();
        imprime.empresaDados(empresa);
    }
}
