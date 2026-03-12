package projeto.java.javacore.Gassociacao.exercicio;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    private String nome;
    private String especialidade;
    private List<Seminario> seminarios = new ArrayList<>();

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, List<Seminario> seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public List<Seminario> getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(List<Seminario> seminarios) {
        this.seminarios = seminarios;
    }
}
