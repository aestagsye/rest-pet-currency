package ru.mentee.power.entity;

import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "exchange_rates")
public class ExchangeRate {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "base_currency_id", nullable = false)
  private Currency baseCurrency;

  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "target_currency_id", nullable = false)
  private Currency targetCurrency;

  @Column(nullable = false, precision = 20, scale = 6)
  private BigDecimal rate;

  public ExchangeRate(Currency baseCurrency, Currency targetCurrency, BigDecimal rate) {
    this.baseCurrency = baseCurrency;
    this.targetCurrency = targetCurrency;
    this.rate = rate;
  }
}
