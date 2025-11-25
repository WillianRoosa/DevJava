package projeto.java.javacore.exception.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.Random;

public class ProcessadorDeDados {
    public static void main(String[] args) {
        try {
            processar();
        } catch (SQLException e) {
            System.out.println("Problema no banco: " + e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println("Problema de arquivo: " + e.getMessage());
        }

        try {
            processar();
        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void processar() throws SQLException, FileNotFoundException {
        Random random = new Random();
        int num = random.nextInt(10);

        if (num % 2 == 0) {
            throw new SQLException("Erro ao tentar conectar o banco de dados");
        } else {
            throw new FileNotFoundException("Erro ao encontrar o arquivo no banco de dados");
        }
    }
}
