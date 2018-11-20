package com.cg;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("exchangeService")
public class ExchangeServiceImpl implements ExchangeService {
	
	@Value("44.5")
	private double exchangeRate;
   
	public double getExchangeRate() {
		System.out.println("getExchangeRate()");
		return exchangeRate;
	}

}
