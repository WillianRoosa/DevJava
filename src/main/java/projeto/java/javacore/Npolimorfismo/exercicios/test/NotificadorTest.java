package projeto.java.javacore.Npolimorfismo.exercicios.test;

import projeto.java.javacore.Npolimorfismo.exercicios.exercicio1.*;

public class NotificadorTest {
    public static void main(String[] args) {
        ServicoDeAlerta alerta = new ServicoDeAlerta();

        Notificador email = new NotificadorEmail();
        Notificador sms = new NotificadorSMS();
        Notificador push = new NotificadorPush();

        String mensagem = "Promoção disponível!";

        alerta.enviarAlerta(email, mensagem);
        alerta.enviarAlerta(sms, mensagem);
        alerta.enviarAlerta(push, mensagem);
    }
}
