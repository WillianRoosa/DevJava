package projeto.java.introducao;

public class Aula5EstruturasCondicionais04 {
    // Exercicio de quanto pagar de imposto Holanda em 2020 //
    public static void main(String[] args) {
        double salarioAnual = 70000;
        double primeiroImposto = 9.70 / 100;
        double segundoImposto = 37.35 / 100;
        double terceiroImposto = 49.50 / 100;
        double valorTotalImposto;

        if (salarioAnual <= 34712) {
            valorTotalImposto = salarioAnual * primeiroImposto;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            valorTotalImposto = salarioAnual * segundoImposto;
        } else {
            valorTotalImposto = salarioAnual * terceiroImposto;
        }
        System.out.println("Valor total de imposto à pagar: " + valorTotalImposto);
    }
}
