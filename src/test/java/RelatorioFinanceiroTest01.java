import projeto.java.javacore.modificadorestatico.dominio.ImprimeRelatorio;
import projeto.java.javacore.modificadorestatico.dominio.RelatorioFinanceiro;

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
