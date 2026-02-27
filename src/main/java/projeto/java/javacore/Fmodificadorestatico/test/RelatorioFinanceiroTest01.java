package projeto.java.javacore.Fmodificadorestatico.test;

import projeto.java.javacore.Fmodificadorestatico.dominio.ImprimeRelatorio;
import projeto.java.javacore.Fmodificadorestatico.dominio.RelatorioFinanceiro;

public class RelatorioFinanceiroTest01 {
    public static void main(String[] args) {
        RelatorioFinanceiro relatorio1 = new RelatorioFinanceiro();
        RelatorioFinanceiro relatorio2 = new RelatorioFinanceiro();

        relatorio1.setNomeEmpresa("Rede de Desenvolvedores");
        relatorio1.setAnoAtual(2025);

        relatorio2.setNomeEmpresa("Grupo CodeLab");
        relatorio2.setAnoAtual(2025);

        ImprimeRelatorio impressora = new ImprimeRelatorio();
        impressora.gerarRelatorio(relatorio1);
        impressora.gerarRelatorio(relatorio2);
    }
}
