package ru.mentee.power.dto;

import java.math.BigDecimal;

public record ExchangeRateRequest(
        CurrencyRequest baseCurrency,
        CurrencyRequest targetCurrency,
        BigDecimal rate
) {
}
