package ru.mentee.power.dto;

import java.math.BigDecimal;

public record ExchangeRateResponse(
        Long id,
        CurrencyResponse baseCurrency,
        CurrencyResponse targetCurrency,
        BigDecimal rate
) {}