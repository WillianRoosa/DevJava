package projeto.java.javacore.Fmodificadorestatico.dominio;

public class ImprimeRelatorio {
    public void gerarRelatorio(RelatorioFinanceiro relatorio) {
        System.out.println();
        System.out.println("Nome da empresa: " + relatorio.getNomeEmpresa());
        System.out.println("Ano atual da empresa: " + relatorio.getAnoAtual());
        for (int i = 0; i < RelatorioFinanceiro.getRecursoEmpresa().length; i++) {
            System.out.println(RelatorioFinanceiro.getDescricoes()[i] + RelatorioFinanceiro.getRecursoEmpresa()[i]);
        }
    }
}
