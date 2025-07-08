import projeto.java.javacore.associacao.dominio.Curso;
import projeto.java.javacore.associacao.dominio.ImprimeCurso;
import projeto.java.javacore.associacao.dominio.Mentor;

public class CursoTest01 {
public static void main(String[] args) {
    Curso curso = new Curso("Java do 0 ao Avançado");
    Mentor mentor = new Mentor("Gustavo Guanabara");
    curso.setMentor(mentor);

    ImprimeCurso impressora = new ImprimeCurso();
    impressora.imprimeCurso(curso);
}
}
