package projeto.java.javacore.interfaces.test;

import projeto.java.javacore.interfaces.exercicios.GoogleDriveBackup;
import projeto.java.javacore.interfaces.exercicios.PenDrive;
import projeto.java.javacore.interfaces.exercicios.RestauradorDeSistema;

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
