package com.kris.microservices.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyRepository extends JpaRepository<ExchangeService, Long>{

	ExchangeService findByFromAndTo(String from,String to);
}
