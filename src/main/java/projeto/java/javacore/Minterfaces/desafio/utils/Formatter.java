package projeto.java.javacore.Minterfaces.desafio.utils;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class Formatter {
    private static final Locale LOCALE = Locale.of("pt", "BR");
    private static final NumberFormat CURRENCY = NumberFormat.getCurrencyInstance(LOCALE);

    public static String ofCurrency(BigDecimal value) {
        if (value == null) {
            return CURRENCY.format(0);
        }
        return CURRENCY.format(value);
    }
}
