package projeto.java.introducao;

public class Aula5EstruturasCondicionais06 {
    public static void main(String[] args) {
        int dia = 6;
        switch (dia) {
            case 1:
            case 7:
                System.out.println("Não é dia útil, pode descansar.");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("É um dia útil, bora trabalhar!!!");
                break;
            default:
                System.out.println("Opção inválido");
                break;
        }
    }
}
