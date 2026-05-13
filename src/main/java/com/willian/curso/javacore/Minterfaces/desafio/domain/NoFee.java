package com.willian.curso.javacore.Minterfaces.desafio.domain;

import com.willian.curso.javacore.Minterfaces.desafio.interfaces.FeeCalculator;

import java.math.BigDecimal;

public class NoFee implements FeeCalculator {
    @Override
    public BigDecimal calculateFee(BigDecimal amount) {
        return BigDecimal.ZERO;
    }
}
