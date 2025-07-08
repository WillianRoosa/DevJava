package projeto.java.javacore.associacao.dominio;

public class ImprimeCurso {
    public void imprimeCurso(Curso curso) {
        System.out.println("--- Curso ---");
        System.out.println(curso.getNome());
        if (curso.getMentor() != null) {
            System.out.println("Mentor -> " + curso.getMentor().getNome());
        }
    }
}
