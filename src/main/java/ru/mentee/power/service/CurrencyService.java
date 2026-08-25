package ru.mentee.power.service;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.mentee.power.dto.CurrencyRequest;
import ru.mentee.power.dto.CurrencyResponse;
import ru.mentee.power.entity.Currency;
import ru.mentee.power.exception.CurrencyNotFoundException;
import ru.mentee.power.mapper.CurrencyMapper;
import ru.mentee.power.repository.CurrencyRepository;

@RequiredArgsConstructor
@Service
public class CurrencyService {
  private final CurrencyRepository repository;
  private final CurrencyMapper mapper;

  public List<CurrencyResponse> findAll() {
    return repository.findAll().stream()
            .map(mapper::toCurrencyResponse)
            .toList();
  }

  public CurrencyResponse findByCode(String code) {
      Currency currency = repository.findByCode(code)
              .orElseThrow(() -> new CurrencyNotFoundException("Валюта не найдена"));
      return mapper.toCurrencyResponse(currency);
  }

  public CurrencyResponse addCurrency(CurrencyRequest request) {
    Currency currency = mapper.toCurrency(request);
    return mapper.toCurrencyResponse(repository.save(currency));
  }
}
