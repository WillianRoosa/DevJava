package projeto.java.javacore.Jmodificadorfinal.test;

import projeto.java.javacore.Jmodificadorfinal.exercicio.ConfigSistema;

public class SingletonTest01 {
    public static void main(String[] args) {
        ConfigSistema sistema1 = ConfigSistema.getINSTANCIA();
        ConfigSistema sistema2 = ConfigSistema.getINSTANCIA();

        System.out.println(sistema1);
        System.out.println(sistema2);
        System.out.println(sistema1 == sistema2);
    }
}
