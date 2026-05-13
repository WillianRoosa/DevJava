package com.willian.curso.javacore.Minterfaces.desafio.domain;

import com.willian.curso.javacore.Minterfaces.desafio.interfaces.FeeCalculator;

import java.math.BigDecimal;

public class Ticket extends Payment {
    private static final BigDecimal BUY_LIMIT = BigDecimal.valueOf(10000);

    public Ticket(BigDecimal value, FeeCalculator feeCalculate) {
        super(value, feeCalculate);
    }

    @Override
    public PaymentStatus process() {
        return (BUY_LIMIT.compareTo(this.value) < 0) ? PaymentStatus.REFUSED : PaymentStatus.PENDING;
    }
}
