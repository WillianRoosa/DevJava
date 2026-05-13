package com.willian.curso.javacore.Minterfaces.desafio.domain;

import com.willian.curso.javacore.Minterfaces.desafio.interfaces.FeeCalculator;

import java.math.BigDecimal;

public class PercentageFee implements FeeCalculator {
    private final BigDecimal percentage;

    public PercentageFee(BigDecimal percentage) {
        this.percentage = percentage;
    }

    @Override
    public BigDecimal calculateFee(BigDecimal amount) {
        return amount.multiply(percentage);
    }
}
