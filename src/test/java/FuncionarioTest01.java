import projeto.java.javacore.introducaoclasses.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Willian";
        funcionario.idade = 25;
        //funcionario.salario = 4.800;

        System.out.println(funcionario.nome);
        System.out.println(funcionario.idade);
        System.out.println(funcionario.salario);

        System.out.println("----------------");

        Funcionario funcionario2 = new Funcionario();
        funcionario2.nome = "Vinicius";
        funcionario2.idade = 23;
        funcionario2.salario = 2.500;

        System.out.println(funcionario2.nome);
        System.out.println(funcionario2.idade);
        System.out.println(funcionario2.salario);
    }
}
