package com.fredgar.pe.repository;

import com.fredgar.pe.enums.Currency;
import com.fredgar.pe.model.ExchangeRate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ExchangeRateRepository extends JpaRepository<ExchangeRate, Integer> {

  ExchangeRate findByCurrencyFromAndCurrencyTo(Currency currencyFrom, Currency currencyTo);

}
