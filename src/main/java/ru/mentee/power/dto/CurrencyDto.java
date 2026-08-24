package ru.mentee.power.dto;

public record CurrencyDto(
        Long id,
        String name,
        String code,
        String sign
) {}