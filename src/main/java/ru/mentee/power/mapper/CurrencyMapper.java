package ru.mentee.power.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.mentee.power.dto.CurrencyRequest;
import ru.mentee.power.dto.CurrencyResponse;
import ru.mentee.power.entity.Currency;

@Mapper(componentModel = "spring")
public interface CurrencyMapper {
  @Mapping(target = "id", ignore = true)
  @Mapping(target = "fullName", source = "name")
  Currency toCurrency(CurrencyRequest request);

  @Mapping(target = "name", source = "fullName")
  CurrencyResponse toCurrencyResponse(Currency currency);
}
