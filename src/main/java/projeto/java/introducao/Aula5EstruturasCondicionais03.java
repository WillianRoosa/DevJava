package projeto.java.introducao;

public class Aula5EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Doar se salario > 5000 //
        double salario = 6000;
        String mensagemDoar = "Eu vou contratar um Dev de 2.500,00";
        String mensagemNaoDoar = "Ainda não tenho condições de contratar um Dev, mas vou ter.";

        // Sintaxe do operador ternário -> (condicao) ? verdadeiro : falso //
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);
    }
}
