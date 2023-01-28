package com.lpu.homework;

public class Person implements name,age{
	protected String name;
	protected int age;
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	public static void main(String[] args) {
		Person m1 = new Person("name", 18);
		System.out.println("Returning name: " + m1.getname());
		System.out.print("Printing name: ");
		m1.printname();
		System.out.print("Printing Age: ");
		m1.printage();
	}
	
	@Override
	public String getname(){
		return name;
	}
	
	@Override
	public void printname() {
		System.out.println(name);
	}
	
	@Override
	public void printage() {
		System.out.println(age);
	}
}
