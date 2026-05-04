package projeto.java.javacore.Npolimorfismo.exercicios.exercicio1;

public class NotificadorSMS implements Notificador {
    @Override
    public void notificar(String mensagem) {
        System.out.println("Enviado por SMS: " + mensagem);
    }
}
