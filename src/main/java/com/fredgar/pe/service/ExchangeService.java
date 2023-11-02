package com.fredgar.pe.service;

import com.fredgar.pe.dto.ExchangeRateDTO;
import com.fredgar.pe.dto.ExchangeRequestDTO;
import com.fredgar.pe.dto.ExchangeResponseDTO;

import java.util.List;
import java.util.Optional;

public interface ExchangeService {

  ExchangeResponseDTO convertCurrency(ExchangeRequestDTO request);
  Optional<ExchangeRateDTO> createExchangeRate(ExchangeRateDTO exchangeRateDTO);
  Optional<ExchangeRateDTO> updateExchangeRate( Integer id, ExchangeRateDTO exchangeRateDTO);
  List<ExchangeRateDTO> findAll();
  Optional<ExchangeRateDTO> findById(Integer id);

}
