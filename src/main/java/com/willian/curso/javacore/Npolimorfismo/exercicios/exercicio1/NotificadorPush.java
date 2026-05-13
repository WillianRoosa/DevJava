package com.willian.curso.javacore.Npolimorfismo.exercicios.exercicio1;

public class NotificadorPush implements Notificador {
    @Override
    public void notificar(String mensagem) {
        System.out.println("Enviado por Push: " + mensagem);
    }
}
