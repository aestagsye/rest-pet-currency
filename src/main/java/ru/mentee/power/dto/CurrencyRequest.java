package ru.mentee.power.dto;

public record CurrencyRequest(
        String name,
        String code,
        String sign
) {
}
