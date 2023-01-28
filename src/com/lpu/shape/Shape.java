package com.lpu.shape;

import com.lpu.shape.exceptions.BlackAndWhiteOnlyException;
import com.lpu.shape.exceptions.NoColorException;
import com.lpu.shape.exceptions.UnPrintableException;

public class Shape implements Art, Spinnable{
	protected String name;
	protected String color = null;
	
	public Shape(){
		name = "ShapeDefault";
	}
	
	public Shape(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String draw(String shape) {
		return "draw";
	}
	
	public String animate(String shape) {
		return "move";
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public void spin() {
		System.out.println("Spinning");
	}
	
	public void print() throws UnPrintableException, NoColorException, BlackAndWhiteOnlyException{
		System.out.println("printed " + name);
	}
}
