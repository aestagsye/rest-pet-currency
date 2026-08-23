package ru.mentee.power;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CurrencyExchangeApplication {

  static void main(String[] args) {
    SpringApplication.run(
            CurrencyExchangeApplication.class,
            args
    );
  }
}
