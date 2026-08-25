package ru.mentee.power.exception;

public class CurrencyNotFoundException extends RuntimeException {
  public CurrencyNotFoundException(String message) {
    super(message);
  }
}