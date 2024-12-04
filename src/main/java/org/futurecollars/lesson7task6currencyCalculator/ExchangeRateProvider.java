package org.futurecollars.lesson7task6currencyCalculator;

import java.math.BigDecimal;

public interface ExchangeRateProvider {
    BigDecimal getBuyRate(Currency currency);
    BigDecimal getSellRate(Currency currency);
}
