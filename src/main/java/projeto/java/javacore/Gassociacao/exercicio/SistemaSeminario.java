package projeto.java.javacore.Gassociacao.exercicio;

import java.util.ArrayList;
import java.util.List;

public class SistemaSeminario {
    private List<Seminario> seminarios = new ArrayList<>();
    private List<Professor> professores = new ArrayList<>();

    public List<Seminario> getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(List<Seminario> seminarios) {
        this.seminarios = seminarios;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }
}
