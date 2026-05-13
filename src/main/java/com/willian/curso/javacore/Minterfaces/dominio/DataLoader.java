package com.willian.curso.javacore.Minterfaces.dominio;

public interface DataLoader {
    void load();

    int MAX_DATA_SIZE = 10;

    default void checkPermission() {
        System.out.println("Checando permissão.");
    }

    static void retrieveMaxDataSize() {
        System.out.println("Dentro do retriveDataMaxSize na interface");
    }
}
