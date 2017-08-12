package com.example.demo.models;

public class Calculator {
	
	//instance variables
	double num1;
	double num2;
	
	//constructor
	public Calculator (double first, double second) {
		num1 = first;
		num2 = second;	
	}
	
	public double add () {
		return num1 + num2;
	}
	public double sub () {
		return num1 - num2;
	}
	public double mlt () {
		return num1 * num2;
	}
	public double div () {
		return num1 / num2;
	}
	public double mod () {
		return num1 % num2;
	}
	public double exp () {
		return Math.pow(num1, num2);
	}
}
