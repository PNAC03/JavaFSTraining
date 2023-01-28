package com.lpu.homework;

public class ElCheck {
	public void age(int input) throws IllegalAgeException{
		if(input>=18) {
			System.out.println("Welcome to VotingMachine");
		}
		else throw new IllegalAgeException("UserNotEligible");
	}
	public static void main(String[] args) {
		ElCheck obj = new ElCheck();
		try{obj.age(17);}
		catch(IllegalAgeException ex) {
			System.out.println("inside ccatch ");
		}
	}
}
