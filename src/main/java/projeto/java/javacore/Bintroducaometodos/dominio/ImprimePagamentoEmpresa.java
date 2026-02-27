package projeto.java.javacore.Bintroducaometodos.dominio;

public class ImprimePagamentoEmpresa {
    public void imprime(EmpresaFuncionario funcionario) {
        System.out.println("---- Funcionário ----");
        System.out.println(funcionario.nome);
        System.out.println(funcionario.idade);

        double[] salario = funcionario.salarios;
        if (salario == null) {
            return;
        }
        for (double num : salario) {
            System.out.print(num + " ");
        }
        calculaMediaSalario(funcionario);
    }

    public void calculaMediaSalario(EmpresaFuncionario calcular) {
        double[] salario = calcular.salarios;
        if (salario == null) {
            return;
        }
        double media = 0;
        for (double num : salario) {
            media += num;
        }
        media /= salario.length;
        System.out.printf("\nMédial Salarial: %.2f%n", media);
    }
}
