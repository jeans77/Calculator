package com.example.demo.models;

public class Case{

	//instance variables
	String received;
	
	//constructor
	public Case (String message) {
		received = message;
	}

	public  String capitalize () {
		return received.toUpperCase();
			}
	

}
