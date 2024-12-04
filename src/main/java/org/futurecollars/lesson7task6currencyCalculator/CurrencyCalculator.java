package org.futurecollars.lesson7task6currencyCalculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CurrencyCalculator {

    private final ExchangeRateProvider exchangeRateProvider;

    public CurrencyCalculator(ExchangeRateProvider exchangeRateProvider) {
        this.exchangeRateProvider = exchangeRateProvider;
    }

    public BigDecimal convertToCurrency(BigDecimal amountInPln, Currency currency, boolean isBuyRate) {
        BigDecimal rate = isBuyRate ? exchangeRateProvider.getBuyRate(currency) : exchangeRateProvider.getSellRate(currency);
        return amountInPln.divide(rate, 2, RoundingMode.HALF_UP);
    }
}



