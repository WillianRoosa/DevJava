package projeto.java.javacore.modificadorestatico.dominio;

public class RelatorioFinanceiro {
    private String nomeEmpresa;
    private int anoAtual;
    private static double[] recursoEmpresa;
    private static boolean iniciado = false;

    {
        if (!iniciado) {
            System.out.println("Iniciando geração do relatório!!!");
            iniciado = true;
        }
    }

    static {
        recursoEmpresa = new double[] { 5000, 2000, 1000 };
    }

    private static String[] descricoes = {
            "Entrada de R$", "Saída de R$", "Investimento de R$"
    };

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public int getAnoAtual() {
        return anoAtual;
    }

    public void setAnoAtual(int anoAtual) {
        this.anoAtual = anoAtual;
    }

    public static double[] getRecursoEmpresa() {
        return RelatorioFinanceiro.recursoEmpresa;
    }

    public static String[] getDescricoes() {
        return RelatorioFinanceiro.descricoes;
    }
}
