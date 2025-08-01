package projeto.java.javacore.polimorfismo.exercicio;

import java.sql.SQLOutput;

public class ServicoDeAlerta {
    public void enviarAlerta(Notificador notificador, String mensagem) {
        notificador.notificar(mensagem);
    }
}
