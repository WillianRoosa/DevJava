package projeto.java.javacore.Gassociacao.dominio;

public class ImprimeEquipe {
    public void dadosEquipe(Equipe equipe) {
        System.out.println("--- Equipe ---");
        System.out.println("Equipe -> " + equipe.getNome());
        if (equipe.getAtletas() == null) {
            return;
        }
        for (Atleta atletas : equipe.getAtletas()) {
            System.out.println("Atletas -> " + atletas.getNome());
        }
    }

    public void dadosAtleta(Atleta atleta) {
        System.out.println();
        System.out.println("--- Atletas ---");
        System.out.println("Atleta -> " + atleta.getNome());
        if (atleta.getEquipe() != null) {
            System.out.println("Equipe -> " + atleta.getEquipe().getNome());
        }
    }
}
