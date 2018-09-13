package com.kris.microservices.currencyexchangeservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private CurrencyRepository repo;
	
	@Autowired
	private Environment environment;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeService currencyConverter(@PathVariable String from,@PathVariable String to)
	{
		ExchangeService exchangeService = repo.findByFromAndTo(from, to);
		exchangeService.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		logger.info("exchange service {}",exchangeService);
		return exchangeService;
	}

}
