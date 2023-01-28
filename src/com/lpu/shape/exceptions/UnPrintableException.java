package com.lpu.shape.exceptions;

/*
 * There would be exceptional logic to handle
 * You would have to create an Exception Class
 * by extending Exception.
 * 
 * Then throw the Exception wherever the exceptional
 * logic is bound to come. All methods who are throwing
 * exceptions must declare it 
 * or they have to catch it
 */
public class UnPrintableException extends Exception {
	public UnPrintableException(String message){
		super(message);
	}
	
}
