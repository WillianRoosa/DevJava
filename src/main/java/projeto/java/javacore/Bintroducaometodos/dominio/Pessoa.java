package projeto.java.javacore.Bintroducaometodos.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            throw new IllegalArgumentException("Usuário não pode ter idade negativa!");
        }
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    /* Metodo teste para validacao de idade*/

    private boolean isMaiorDeIdade() {
        return idade >= 18;
    }

    private void statusCompra() {
        if (isMaiorDeIdade()) {
            System.out.println("Usuário possui maioridade (18), compra realizada com sucesso...");
            return;
        }
        System.out.println("Usuário não possui idade para efetuar a compra!!!");
    }

    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);

        statusCompra();
    }
}
