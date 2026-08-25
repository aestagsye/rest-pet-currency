package ru.mentee.power.controller;

import java.net.URI;
import java.util.List;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.mentee.power.dto.CurrencyRequest;
import ru.mentee.power.dto.CurrencyResponse;
import ru.mentee.power.service.CurrencyService;

@RequiredArgsConstructor
@RestController
public class CurrencyController {

  private final CurrencyService service;

  @GetMapping("/currencies")
  public ResponseEntity<List<CurrencyResponse>> getCurrencies() {
    return ResponseEntity.ok(service.findAll());
  }

  @GetMapping("/currency/{code}")
  public ResponseEntity<CurrencyResponse> getCurrency(@PathVariable String code) {
    return ResponseEntity.ok(service.findByCode(code));
  }

  @PostMapping("/currencies")
  public ResponseEntity<CurrencyResponse> createCurrency(
          @Valid @RequestBody CurrencyRequest request
  ) {
    CurrencyResponse created = service.addCurrency(request);
    URI location = URI.create("/currency/" + created.code());
    return ResponseEntity.created(location).body(created);
  }
}
