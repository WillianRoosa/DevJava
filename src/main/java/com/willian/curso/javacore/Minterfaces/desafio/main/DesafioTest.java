package com.willian.curso.javacore.Minterfaces.desafio.main;

import com.willian.curso.javacore.Minterfaces.desafio.domain.*;
import projeto.java.javacore.Minterfaces.desafio.domain.*;
import willian.curso.javacore.Minterfaces.desafio.domain.*;
import com.willian.curso.javacore.Minterfaces.desafio.service.ReceiptService;

import java.math.BigDecimal;

public class DesafioTest {
    public static void main(String[] args) {

        Payment card = new CreditCard(BigDecimal.valueOf(2500), new PercentageFee(BigDecimal.valueOf(0.05)));
        Payment pix = new Pix(BigDecimal.valueOf(7890), new NoFee());
        Payment ticket = new Ticket(BigDecimal.valueOf(6789.95), new PercentageFee(BigDecimal.valueOf(0.02)));
        Payment pix1 = new Pix(BigDecimal.valueOf(11500), new NoFee());

        ReceiptService.generateReceipt(card);
        ReceiptService.generateReceipt(pix);
        ReceiptService.generateReceipt(ticket);
        ReceiptService.generateReceipt(pix1);
    }
}
