package com.example.demo.models;

public class Cap{

	//instance variables
	String received;
	
	//constructor
	public Cap (String message) {
		received = message;
	}

	public  String capitalize () {
		return received.toUpperCase();
			}
	

}
