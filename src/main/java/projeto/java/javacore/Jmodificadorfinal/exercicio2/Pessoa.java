package projeto.java.javacore.Jmodificadorfinal.exercicio2;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", endereco=" + endereco +
                '}';
    }

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void relatorio() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        if (this.endereco != null) {
            System.out.println("Endereço: " + endereco);
        } else {
            System.out.println("Endereço não informado...");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}