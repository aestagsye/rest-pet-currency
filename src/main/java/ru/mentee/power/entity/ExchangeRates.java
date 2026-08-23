package ru.mentee.power.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "exchange")
public class ExchangeRates {
  @Id
  @Column(name = "id")
  private Long id;

  @Column(name = "basecurrency")
  private String BaseCurrencyId;

  @Column(name = "targetcurrency")
  private String TargetCurrencyId;

  @Column(name = "rate")
  private BigDecimal rate;
}
