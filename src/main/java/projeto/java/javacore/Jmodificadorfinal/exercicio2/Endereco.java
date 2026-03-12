package projeto.java.javacore.Jmodificadorfinal.exercicio2;

public class Endereco {
    private String cidade;
    private String estado;
    private String rua;
    private Integer numeroDaCasa;

    @Override
    public String toString() {
        return "{" +
                "cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", rua='" + rua + '\'' +
                ", numeroDaCasa=" + numeroDaCasa +
                '}';
    }

    public Endereco(String cidade, String estado, String rua, Integer numeroDaCasa) {
        this.cidade = cidade;
        this.estado = estado;
        this.rua = rua;
        this.numeroDaCasa = numeroDaCasa;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Integer getNumeroDaCasa() {
        return numeroDaCasa;
    }

    public void setNumeroDaCasa(Integer numeroDaCasa) {
        this.numeroDaCasa = numeroDaCasa;
    }
}
