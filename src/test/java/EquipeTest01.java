import projeto.java.javacore.associacao.dominio.Atleta;
import projeto.java.javacore.associacao.dominio.Equipe;
import projeto.java.javacore.associacao.dominio.ImprimeEquipe;

public class EquipeTest01 {
    public static void main(String[] args) {
        Atleta atleta1 = new Atleta("Willian Vinicius da Rosa");
        Atleta atleta2 = new Atleta("Edson Roberto da Rosa");
        Atleta atleta3 = new Atleta("Alex Erison da Rosa");
        Atleta[] atletas = new Atleta[] { atleta1, atleta2, atleta3 };

        Equipe equipe = new Equipe("São Bento Football Clube");

        atleta1.setEquipe(equipe);
        atleta2.setEquipe(equipe);
        atleta3.setEquipe(equipe);
        equipe.setAtletas(atletas);

        ImprimeEquipe impressora = new ImprimeEquipe();
        impressora.dadosEquipe(equipe);
        impressora.dadosAtleta(atleta1);
        impressora.dadosAtleta(atleta2);
        impressora.dadosAtleta(atleta3);
    }
}
