package com.cg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CurrencyConverterClient {
	
	
	public static void main(String[] args) {
		
		ApplicationContext factory= new ClassPathXmlApplicationContext("currencyconverter.xml");
		CurrencyConverter curr=(CurrencyConverter) factory.getBean("currencyConverterImpl");//bean id in xml
		double rupees= curr.dollarsToRupees(50.0);
		System.out.println("50 $ is"+rupees+"Rs.");
	}
	

}
