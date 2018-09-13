package com.kris.microservices.currencyexchangeservice;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ExchangeService {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="currency_from")
	private String from;
	@Column(name="currency_to")
	private String to;
	@Column(name="conversion_Multiple")
	private BigDecimal conversionMultiple;
	private int port;
	
	public ExchangeService(){}

	public ExchangeService(String from, String to, BigDecimal conversionMultiple) {
		super();
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
	}

	public Long getId() {
		return id;
	}

	public String getFrom() {
		return from;
	}

	public String getTo() {
		return to;
	}

	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	};
	
	

}
