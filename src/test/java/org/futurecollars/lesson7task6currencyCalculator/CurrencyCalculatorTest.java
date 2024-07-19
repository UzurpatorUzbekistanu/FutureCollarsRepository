package org.futurecollars.lesson7task6currencyCalculator;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.math.BigDecimal;

public class CurrencyCalculatorTest {

    @Mock
    private ExchangeRateProvider exchangeRateProvider;

    private CurrencyCalculator currencyCalculator;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        currencyCalculator = new CurrencyCalculator(exchangeRateProvider);
    }

    @Test
    public void testConvertToCurrencyBuyRate() {
        // Arrange
        when(exchangeRateProvider.getBuyRate(Currency.EUR)).thenReturn(new BigDecimal("4.5"));

        // Act
        BigDecimal result = currencyCalculator.convertToCurrency(new BigDecimal("45"), Currency.EUR, true);

        // Assert
        assertEquals(new BigDecimal("10.00"), result);
    }

    @Test
    public void testConvertToCurrencySellRate() {
        // Arrange
        when(exchangeRateProvider.getSellRate(Currency.USD)).thenReturn(new BigDecimal("4.0"));

        // Act
        BigDecimal result = currencyCalculator.convertToCurrency(new BigDecimal("40"), Currency.USD, false);

        // Assert
        assertEquals(new BigDecimal("10.00"), result);
    }
}

