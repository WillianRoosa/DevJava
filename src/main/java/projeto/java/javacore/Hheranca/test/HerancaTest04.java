package projeto.java.javacore.Hheranca.test;

import projeto.java.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest04 {
    /* 0 - Bloco de inicialização estático da super classe é executado quando a JVM carregar a classe pai
     * 1 - Bloco de inicialização estático da sub-classe é executado quando a JVM carregar a classe filha
     * 2 - Alocado espaço em memória para o objeto da superClasse
     * 3 - Cada Atributo de superclasse é criado e inicializados com valores default ou com valor passado
     * 4 - Bloco de inicialização  da superClasse é executado na ordem em que aparece
     * 5 - Construtor é executado da superClasse
     * Ai vem a sub-classe
     * 6 - Alocado espaço em memória para o objeto da sub-classe
     * 7 - Cada Atributo de sub-classe é criado e inicializados com valores default ou com valor passado
     * 8 - Bloco de inicialização  da sub-classe é executado na ordem em que aparece
     * 9 - Construtor é executado da sub-classe*/
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Willian");
    }
}
