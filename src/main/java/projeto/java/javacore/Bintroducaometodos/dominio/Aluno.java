package projeto.java.javacore.Bintroducaometodos.dominio;

public class Aluno {
    public String nomeAluno;
    public double[] notas;
    private double media = 0;

    public double getMedia() {
        return media;
    }

    public void aplicaMedia() {
        if (notas == null) {
            return;
        }

        media = 0;
        for (double num : notas) {
            media += num;
        }
        media /= notas.length;
    }
}
