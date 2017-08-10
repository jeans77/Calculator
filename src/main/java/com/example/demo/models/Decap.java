package com.example.demo.models;

public class Decap {

	//instance variables
	String received;
	
	//constructor
	public Decap (String message) {
		received = message;
	}

	public  String decapitalize () {
		return received.toLowerCase();
			}

}
