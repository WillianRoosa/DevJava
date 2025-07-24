package projeto.java.javacore.interfaces.dominio;

public class FileLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo!");
    }

    @Override
    public void remover() {
        System.out.println("Removendo do arquivo...");
    }

    @Override
    public void checkingPermission() {
        System.out.println("Checando permissão do arquivo !!!");
    }
}
