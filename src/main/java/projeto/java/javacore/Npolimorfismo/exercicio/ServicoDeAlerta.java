package projeto.java.javacore.Npolimorfismo.exercicio;

public class ServicoDeAlerta {
    public void enviarAlerta(Notificador notificador, String mensagem) {
        notificador.notificar(mensagem);
    }
}
