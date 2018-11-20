package com.cg;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CurrencyConverterImpl implements CurrencyConverter {
	@Autowired
	private ExchangeServiceImpl exchangeService;
     @PostConstruct
     private void init() {
     System.out.println("init()");
	}
     @PreDestroy
     private void destroy(){
		// TODO Auto-generated method stub
   System.out.println("destroy()");
	}

	public CurrencyConverterImpl() {
		System.out.println("CurrencyConverterImpl()");
	}
   @Autowired
	public CurrencyConverterImpl(ExchangeServiceImpl exchangeService) {

		this.exchangeService = exchangeService;
	}


	public double dollarsToRupees(double dollars) {
	    System.out.println("dollarsToRupees()");
		return dollars*exchangeService.getExchangeRate();
	}

}
