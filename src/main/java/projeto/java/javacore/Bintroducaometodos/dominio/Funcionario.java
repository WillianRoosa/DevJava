package projeto.java.javacore.Bintroducaometodos.dominio;

import java.text.NumberFormat;
import java.util.Locale;

public class Funcionario {
    Locale locale = new Locale("pt", "BR");
    NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);

    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }

    public void imprimeMediaSalario() {
        if (salarios == null) {
            return;
        }

        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println("\nMédia Salárial: " + formatter.format(media));
    }

    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (salarios == null) {
            return;
        }
        for (double salario : salarios) {
            System.out.print("Salário: " + formatter.format(salario) + " | ");
        }
        imprimeMediaSalario();
    }
}
