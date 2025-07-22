package projeto.java.javacore.enums.exercicio;

public class Pedido {
    private String numeroPedido;
    private double valorTotal;
    private FormaPagamento formaPagamento;

    public Pedido(String numeroPedido, double valorTotal, FormaPagamento formaPagamento) {
        this.numeroPedido = numeroPedido;
        this.valorTotal = valorTotal;
        this.formaPagamento = formaPagamento;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "numeroPedido = '" + numeroPedido + '\'' +
                ", valorTotal = " + valorTotal +
                ", formaPagamento = " + formaPagamento +
                ", precoFinal = "+ formaPagamento.calcularValorFinal(valorTotal)+
                '}';
    }

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }
}
