package com.lpu.homework;

class Car extends Vehicle {
//	void print() {
//		System.out.println("CarCLass");
//	}
}

class Vehicle{
	void print() {
		System.out.println("Vehicle Class");
	}
}

public class Test {
	public static void main(String[] args) {
		Vehicle obj1 = new Car();
		obj1.print();
		
		Vehicle obj2 = new Vehicle();
		obj2.print();
}
}
