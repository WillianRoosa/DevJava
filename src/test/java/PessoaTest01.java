import projeto.java.javacore.introducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        // pessoa.nome = "Willian"; -> Forma antiga de instânciar uma classe publica
        // pessoa.idade = 23;

        pessoa.setNome("Willian");
        pessoa.setIdade(23);

        // pessoa.imprime(); -> forma antiga de imprimir os dados da classe, apesar de
        // usar, estou aprendendo o uso do Get e Set.

        System.out.println(pessoa.getNome() + "\n" + pessoa.getIdade());
    }
}
