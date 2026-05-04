package projeto.java.javacore.Minterfaces.desafio.domain;

import projeto.java.javacore.Minterfaces.desafio.interfaces.FeeCalculator;

import java.math.BigDecimal;

public class CreditCard extends Payment {
    private static final BigDecimal CARD_LIMIT = BigDecimal.valueOf(5000);

    public CreditCard(BigDecimal value, FeeCalculator feeCalculate) {
        super(value, feeCalculate);
    }

    @Override
    public PaymentStatus process() {
        return (CARD_LIMIT.compareTo(this.value) < 0) ? PaymentStatus.REFUSED : PaymentStatus.APPROVED;
    }
}
