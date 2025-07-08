import projeto.java.javacore.associacao.dominio.Jogador;
import projeto.java.javacore.associacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Neymar Jr");
        Jogador jogador2 = new Jogador("Ronaldinho Gaucho");
        Time time = new Time("Brasil");
        Jogador[] jogadores = new Jogador[] { jogador1, jogador2 };

        jogador1.setTime(time);
        jogador2.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");
        jogador1.imprime();

        System.out.println("--- Time ---");
        time.imprime();
    }
}
