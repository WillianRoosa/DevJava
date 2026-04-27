package projeto.java.javacore.Minterfaces.exercicios;

public class GoogleDriveBackup implements Salvavel, Carregavel {
    @Override
    public void salvar() {
        System.out.println("Salvando dentro do GoogleDriveBackup");
    }

    @Override
    public void carregar() {
        System.out.println("Carregando dentro do GoogleDriveBackup");
    }
}
