package projeto.java.javacore.Jmodificadorfinal.test;

import projeto.java.javacore.Jmodificadorfinal.exercicio.Documento;

public class DocumentoTest01 {
    public static void main(String[] args) {
        Documento documento = new Documento();
        documento.setTitulo("Certidão de Nascimento");
        documento.setAutor("Willian Rosa");

        System.out.println(documento);
        documento.exibirDocumento();
    }
}
