package projeto.java.javacore.enums.exercicio;

public enum FormaPagamento {
    PIX{
        @Override
        public double calcularValorFinal(double valor) {
            return valor * 1.15;
        }
    },
    BOLETO{
        @Override
        public double calcularValorFinal(double valor) {
            return valor * 0.5;
        }
    },
    CARTAO{
        @Override
        public double calcularValorFinal(double valor) {
            return  valor + (valor * 0.2);
        }
    };

    public abstract double calcularValorFinal(double valor);
}
