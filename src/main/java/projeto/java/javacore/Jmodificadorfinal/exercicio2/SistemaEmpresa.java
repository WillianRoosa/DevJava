package projeto.java.javacore.Jmodificadorfinal.exercicio2;

public final class SistemaEmpresa {
    private static final SistemaEmpresa INSTANCE = new SistemaEmpresa();

    private SistemaEmpresa() {
    }

    public static SistemaEmpresa getInstance() {
        return INSTANCE;
    }

    public void registrarFuncionario(Funcionario... listaDeFuncionarios) {
        for (Funcionario funcionario : listaDeFuncionarios) {
            if (funcionario != null) {
                System.out.println("Registrando no sistema central: " + funcionario.getNome());
            }
        }
    }
}
