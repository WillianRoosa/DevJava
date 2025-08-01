package projeto.java.javacore.polimorfismo.exercicio;

public class NotificadorPush implements Notificador {
    @Override
    public void notificar(String mensagem) {
        System.out.println("Enviado por Push: " + mensagem);
    }
}
