package projeto.java.javacore.interfaces.test;

import projeto.java.javacore.interfaces.dominio.DataBaseLoader;
import projeto.java.javacore.interfaces.dominio.DataLoader;
import projeto.java.javacore.interfaces.dominio.FileLoader;

public class InterfaceTest01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        dataBaseLoader.load();
        fileLoader.load();

        dataBaseLoader.remover();
        fileLoader.remover();

        dataBaseLoader.checkingPermission();
        fileLoader.checkingPermission();

        DataLoader.retriveMaxDataSize();
        DataBaseLoader.retriveMaxDataSize();
    }
}
