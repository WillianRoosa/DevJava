package projeto.java.javacore.Minterfaces.test;

import projeto.java.javacore.Minterfaces.dominio.DataBaseLoader;
import projeto.java.javacore.Minterfaces.dominio.DataLoader;
import projeto.java.javacore.Minterfaces.dominio.FileLoader;

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
