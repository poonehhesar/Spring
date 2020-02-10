package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Upg1 {

	@RequestMapping(path = "/add", method = RequestMethod.GET)	
	public double add(double a, double b) {
		
		double add = (a + b);
		return add;		
	}
	
	@RequestMapping(path = "/multiply", method = RequestMethod.GET)	
	public double multiply(double a, double b) {

		double multi = (a * b);
		return multi;
	}
	
	@RequestMapping(path = "/subtract", method = RequestMethod.GET)	
	public double subtract(double a, double b) {

		double sub = (a - b);
		return sub;		
	}
	
	@RequestMapping(path = "/divide", method = RequestMethod.GET)	
	public double div(double a, double b) {

		double div = (a / b);
		return div;		
	}
	
	@RequestMapping(path = "/average", method = RequestMethod.GET)	
	public double average(double a, double b, double c, double d) {

		double average = (a + b + c + d) /4;
		return average;
	}

	@RequestMapping(path = "/sqrt", method = RequestMethod.GET)	
	public double sqrt(double a) {

		double sqrt =  Math.sqrt(a);
		return sqrt;
	}
	

}
	


