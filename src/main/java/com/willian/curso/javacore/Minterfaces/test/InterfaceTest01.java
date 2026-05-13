package com.willian.curso.javacore.Minterfaces.test;

import com.willian.curso.javacore.Minterfaces.dominio.DataBaseLoader;
import com.willian.curso.javacore.Minterfaces.dominio.DataLoader;
import com.willian.curso.javacore.Minterfaces.dominio.FileLoader;

public class InterfaceTest01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        dataBaseLoader.load();
        fileLoader.load();

        dataBaseLoader.remove();
        fileLoader.remove();

        dataBaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retrieveMaxDataSize();
        DataBaseLoader.retrieveMaxDataSize();
    }
}
