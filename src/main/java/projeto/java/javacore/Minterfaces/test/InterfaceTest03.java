package projeto.java.javacore.Minterfaces.test;

import projeto.java.javacore.Minterfaces.exercicios.GoogleDriveBackup;
import projeto.java.javacore.Minterfaces.exercicios.PenDrive;
import projeto.java.javacore.Minterfaces.exercicios.RestauradorDeSistema;

public class InterfaceTest03 {
    public static void main(String[] args) {
        GoogleDriveBackup googleDriveBackup = new GoogleDriveBackup();
        googleDriveBackup.salvar();
        googleDriveBackup.carregar();

        PenDrive penDrive = new PenDrive();
        penDrive.salvar();

        RestauradorDeSistema restauradorDeSistema = new RestauradorDeSistema();
        restauradorDeSistema.carregar();
    }
}
