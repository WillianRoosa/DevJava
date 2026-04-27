package projeto.java.javacore.Lclassesabstratas.exercicio;

public class Pix extends Pagamento implements Taxavel {

    public Pix(double valor) {
        super(valor);
    }

    @Override
    public double calcularTaxa() {
        return this.valor * 0.02;
    }

    @Override
    public void imprimirRecibo() {
        double taxa = calcularTaxa();
        System.out.printf("Taxa: %.2f\n", taxa);
        System.out.printf("Pagamento via Pix no valor de R$ %.2f\n", this.valor);
    }
}
