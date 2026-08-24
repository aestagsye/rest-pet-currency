package ru.mentee.power.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mentee.power.entity.Currency;

public interface CurrencyRepository extends JpaRepository<Currency, Long> {
}

