package projeto.java.introducao;

public class Aula5EstruturasCondicionais05 {
    public static void main(String[] args) {
        // imprima o dia da semana, considerando 1 como domingo //
        byte dia = 5;
        // Variaveis para usar no switch -> char, int, byte, short, enum, String //
        switch (dia) {
            case 1:
                System.out.println("Dom");
                break;
            case 2:
                System.out.println("Seg");
                break;
            case 3:
                System.out.println("Ter");
                break;
            case 4:
                System.out.println("Qua");
                break;
            case 5:
                System.out.println("Qui");
                break;
            case 6:
                System.out.println("Sex");
                break;
            case 7:
                System.out.println("Sab");
                break;
            default:
                System.out.println("Opcão inválida!");
                break;
        }

        char sexo = 'M';
        switch (sexo) {
            case 'M':
                System.out.println("Sexo Masculino!");
                break;
            case 'F':
                System.out.println("Sexo Feminino!");
                break;
            default:
                System.out.println("Opção de sexo inválida");
        }
    }
}
