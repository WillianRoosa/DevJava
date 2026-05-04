package projeto.java.javacore.Oexception.exception.dominio;

public class LoginInvalidoException extends Exception {
    public LoginInvalidoException() {
        System.out.println("email ou senha do usuário são inválido!!!");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
