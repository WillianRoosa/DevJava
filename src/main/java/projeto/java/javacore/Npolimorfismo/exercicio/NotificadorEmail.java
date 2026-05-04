package projeto.java.javacore.Npolimorfismo.exercicio;

public class NotificadorEmail implements Notificador {
    @Override
    public void notificar(String mensagem) {
        System.out.println("Enviado por E-MAIL: " + mensagem);
    }
}
