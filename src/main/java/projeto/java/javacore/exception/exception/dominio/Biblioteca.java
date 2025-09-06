package projeto.java.javacore.exception.exception.dominio;

public class Biblioteca {
    public static void emprestar(Livro livro) throws LivroIndisponivelException {
        System.out.println("--- PROCESSANDO EMPRÉSTIMO --- ");
        if (livro.isDisponivel()) {
            livro.setDisponivel(false);
            System.out.printf("Livro: \"%s\" emprestado com sucesso!\n", livro.getTitulo());
        } else {
            throw new LivroIndisponivelException(
                    "Erro: O livro \"" + livro.getTitulo() + "\"já foi emprestado"
            );
        }
    }
}
