package com.willian.curso.javacore.Minterfaces.desafio.service;

import com.willian.curso.javacore.Minterfaces.desafio.domain.Payment;
import com.willian.curso.javacore.Minterfaces.desafio.utils.Formatter;

import java.math.BigDecimal;

public class ReceiptService {
    public static void generateReceipt(Payment payment) {
        System.out.println("===== RECIBO DE PAGAMENTO =====");
        System.out.println("Valor do produto: " + Formatter.ofCurrency(payment.getValue()));

        BigDecimal feeValue = payment.getFee();
        BigDecimal total = payment.getValue().add(feeValue);

        System.out.println("Valor da taxa: " + Formatter.ofCurrency(feeValue));
        System.out.println("Valor Total à pagar: " + Formatter.ofCurrency(total));
        System.out.println("Status: " + payment.process().getDescription());
        System.out.println("=============================");
    }
}
