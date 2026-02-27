package projeto.java.javacore.modificadorfinal.test;

import projeto.java.javacore.modificadorfinal.exercicio.ConfigSistema;

public class SingletonTest01 {
    public static void main(String[] args) {
        ConfigSistema sistema1 = ConfigSistema.getINSTANCIA();
        ConfigSistema sistema2 = ConfigSistema.getINSTANCIA();

        System.out.println(sistema1);
        System.out.println(sistema2);
        System.out.println(sistema1 == sistema2);
    }
}
