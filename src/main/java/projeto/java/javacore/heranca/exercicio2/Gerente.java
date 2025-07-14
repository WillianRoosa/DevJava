package projeto.java.javacore.heranca.exercicio2;

public class Gerente extends Funcionario {
    private Vendedor[] vendedores;

    public Gerente(String nome, String cpf, String endereco, double salario) {
        super(nome, cpf, endereco, salario);
    }

    public void setVendedores(Vendedor[] vendedores) {
        this.vendedores = vendedores;
    }

    public Vendedor[] getVendedores() {
        return vendedores;
    }
}
