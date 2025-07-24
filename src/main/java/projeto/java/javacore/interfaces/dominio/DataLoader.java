package projeto.java.javacore.interfaces.dominio;

public interface DataLoader {
    void load();

    int MAX_DATA_SIZE = 10;

    default void checkingPermission() {
        System.out.println("Checando permissão.");
    }

    static void retriveMaxDataSize() {
        System.out.println("Dentro do retriveDataMaxSize na interface");
    }
}
