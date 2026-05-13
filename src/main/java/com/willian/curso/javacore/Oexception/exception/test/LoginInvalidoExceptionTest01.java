package com.willian.curso.javacore.Oexception.exception.test;

import com.willian.curso.javacore.Oexception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    public static void logar() throws LoginInvalidoException {
        Scanner teclado = new Scanner(System.in);
        String usernameDB = "Willian";
        String senhaDB = "1234";

        System.out.println("Usuário");
        String usernameDigitado = teclado.nextLine();
        System.out.println("Senha");
        String senhaDigitada = teclado.nextLine();

        if (!usernameDB.equals(usernameDigitado) || !senhaDB.equals(senhaDigitada)) {
            throw new LoginInvalidoException("Usuário ou senha inválidos!!!");
        }

        System.out.println("Usuário logado com sucesso :)");
    }
}
