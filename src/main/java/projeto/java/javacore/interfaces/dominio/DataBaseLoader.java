package projeto.java.javacore.interfaces.dominio;

public class DataBaseLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados!!");
    }

    @Override
    public void remover() {
        System.out.println("Removendo do banco de dados...");
    }

    @Override
    public void checkingPermission(){
        System.out.println("Checando permissão do banco de dados...");
    }

    public static void retriveMaxDataSize() {
        System.out.println("Dentro do retriveDataMaxSize na DataBaseLoader");
    }
}
