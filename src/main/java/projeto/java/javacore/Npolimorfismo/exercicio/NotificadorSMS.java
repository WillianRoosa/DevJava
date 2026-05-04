package projeto.java.javacore.Npolimorfismo.exercicio;

public class NotificadorSMS implements Notificador {
    @Override
    public void notificar(String mensagem) {
        System.out.println("Enviado por SMS: " + mensagem);
    }
}
