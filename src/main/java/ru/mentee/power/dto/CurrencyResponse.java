package ru.mentee.power.dto;

public record CurrencyResponse(
        Long id,
        String name,
        String code,
        String sign
) {}