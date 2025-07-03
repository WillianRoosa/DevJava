package projeto.java.javacore.modificadorestatico.dominio;

public class UsuarioOnline {
    private String nome;
    private String email;
    private static int totalUsuariosOnline = 0;

    static {
        System.out.println("---- Total de usuários online ----");
    }

    public UsuarioOnline(String nome, String email) {
        this.nome = nome;
        this.email = email;
        totalUsuariosOnline++;
    }

    public void logout() {
        if (totalUsuariosOnline > 0) {
            totalUsuariosOnline--;
            System.out.println(this.nome + " fez logout!");
        }
    }

    public String getNome() {
        return this.nome;
    }

    public String getEmail() {
        return this.email;
    }

    public static int getTotalUsuariosOnline() {
        return UsuarioOnline.totalUsuariosOnline;
    }
}
