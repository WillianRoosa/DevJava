package projeto.java.javacore.modificadorestatico.dominio;

public class ImprimeUsuarioOnline {
    public void imprimeUsuario(UsuarioOnline imprime) {
        System.out.println("---- Usuario ----");
        System.out.println("Nome do usuário: " + imprime.getNome());
        System.out.println("Email do usuário: " + imprime.getEmail());
    }
}
