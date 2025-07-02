package projeto.java.introducao;

public class Aula5EstruturasCondicionais02 {
    public static void main(String[] args) {
        /*
        idade < 15 Categoria infantil
        idade >= 15 && idade < 18 Categoria Juvenil
        idade >= 18 categoria adulto
         */
        int idade = 18;
        String categoria;

        if (idade < 15) {
            categoria = "Você é da categoria Infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Você está na categoria Juvenil";
        } else {
            categoria = "Você está na categoria Adulto";
        }
        System.out.println(categoria);
    }
}
