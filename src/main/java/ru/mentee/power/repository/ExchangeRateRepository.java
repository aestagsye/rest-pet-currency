package ru.mentee.power.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mentee.power.entity.ExchangeRate;

public interface ExchangeRateRepository extends JpaRepository<ExchangeRate, Long> {
}
