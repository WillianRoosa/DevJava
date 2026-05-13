package com.willian.curso.javacore.Minterfaces.desafio.domain;

import com.willian.curso.javacore.Minterfaces.desafio.interfaces.FeeCalculator;

import java.math.BigDecimal;

public abstract class Payment {
    protected BigDecimal value;
    private final FeeCalculator feeCalculator;

    public Payment(BigDecimal value, FeeCalculator feeCalculator) {
        if (value == null || value.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("O valor do pagamento deve ser maior que zero: " + value);
        }

        if (feeCalculator == null) {
            throw new IllegalArgumentException("FeeCalculator não deve ser nulo!");
        }

        this.value = value;
        this.feeCalculator = feeCalculator;
    }

    public BigDecimal getFee() {
        return feeCalculator.calculateFee(this.value);
    }

    public abstract PaymentStatus process();

    public BigDecimal getValue() {
        return this.value;
    }
}
