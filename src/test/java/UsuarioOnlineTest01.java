import projeto.java.javacore.modificadorestatico.dominio.ImprimeUsuarioOnline;
import projeto.java.javacore.modificadorestatico.dominio.UsuarioOnline;

public class UsuarioOnlineTest01 {
    public static void main(String[] args) {
        UsuarioOnline user1 = new UsuarioOnline("Willian", "willian.rosa@gmail.com");
        UsuarioOnline user2 = new UsuarioOnline("Vinicius", "vini_rosa@icloud.com");
        UsuarioOnline user3 = new UsuarioOnline("Jonas", "jonas.gomes@hotmail.com");

        user2.logout();

        ImprimeUsuarioOnline impressora = new ImprimeUsuarioOnline();
        impressora.imprimeUsuario(user1);
        impressora.imprimeUsuario(user2);
        impressora.imprimeUsuario(user3);

        System.out.println("Usuários Online: " + UsuarioOnline.getTotalUsuariosOnline());
    }
}
