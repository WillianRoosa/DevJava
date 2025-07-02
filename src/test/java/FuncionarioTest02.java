import projeto.java.javacore.introducaometodos.dominio.Funcionario;

public class FuncionarioTest02 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Willian");
        funcionario.setIdade(23);
        funcionario.setSalarios(new double[] { 2200.00, 2487.20, 3290.90 });

        funcionario.imprime();
        funcionario.getSalarios();
    }
}
