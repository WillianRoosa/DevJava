package projeto.java.introducao;

public class Aula6EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        double valorTotal = 40000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela " + parcela + "x  R$" + valorParcela);
        }

        double produto = 100;

        for (int unidade = 1; unidade <= 10; unidade++) {
            double desconto = 0;
            if (unidade > 1) {
                desconto = Math.min((unidade - 1) * 5, 25);
            }

            double valorUnitario = produto * (1 - desconto / 100);
            if (valorUnitario < 60) {
                break;
            }

            double total = valorUnitario * unidade;

            System.out.printf("%d unidade(s) - R$%.2f cada - Total: R$%.2f\n",unidade,valorUnitario,total);
        }
    }
}
