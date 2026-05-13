package com.willian.curso.javacore.Lclassesabstratas.test;

import com.willian.curso.javacore.Lclassesabstratas.exercicio.Cartao;
import com.willian.curso.javacore.Lclassesabstratas.exercicio.Pagamento;
import com.willian.curso.javacore.Lclassesabstratas.exercicio.Pix;

public class ExercicioTest {
    public static void main(String[] args) {
        Pagamento[] pagamento = {new Cartao(1000), new Pix(1000)};

        for (Pagamento pagamentos : pagamento){
            pagamentos.processar();
            pagamentos.imprimirRecibo();
            System.out.println("--------------");
        }
    }
}
