package com.willian.curso.javacore.Minterfaces.test;

import com.willian.curso.javacore.Minterfaces.exercicios.GoogleDriveBackup;
import com.willian.curso.javacore.Minterfaces.exercicios.PenDrive;
import com.willian.curso.javacore.Minterfaces.exercicios.RestauradorDeSistema;

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
