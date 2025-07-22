package projeto.java.javacore.enums.exercicio;

public enum TipoProduto {
    ALIMENTO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.10;
        }
    },
    BEBIDA{
        @Override
        public double calcularDesconto(double valor) {
            return  valor * 0.05;
        }
    },
    ELETRONICO{
        @Override
        public double calcularDesconto(double valor) {
            return valor;
        }
    };

    public abstract double calcularDesconto(double valor);
}
