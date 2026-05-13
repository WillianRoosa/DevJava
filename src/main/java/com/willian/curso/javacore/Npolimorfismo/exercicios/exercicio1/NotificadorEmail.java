package com.willian.curso.javacore.Npolimorfismo.exercicios.exercicio1;

public class NotificadorEmail implements Notificador {
    @Override
    public void notificar(String mensagem) {
        System.out.println("Enviado por E-MAIL: " + mensagem);
    }
}
