package projeto.java.javacore.Npolimorfismo.exercicios.exercicio1;

public class ServicoDeAlerta {
    public void enviarAlerta(Notificador notificador, String mensagem) {
        notificador.notificar(mensagem);
    }
}
