package com.lpu.shape;

import com.lpu.shape.CircleBasic;
import com.lpu.shape.Triangle;
import com.lpu.shape.Triangle2;
import com.lpu.shape.exceptions.NoColorException;
import com.lpu.shape.exceptions.UnPrintableException;
import com.lpu.shape.exceptions.BlackAndWhiteOnlyException;
import com.lpu.shape.Art;
import com.lpu.shape.Shape;
import java.io.IOException;

public class Client2{
	public static void main(String[] args){
	CircleBasic cb1 = new CircleBasic(5,"MyCircle");
	CircleBasic cb2 = new CircleBasic(5,"MyCircle");
	Triangle tr = new Triangle(2,3,"MyTriangle");
	
	Shape s = new CircleBasic(5,"MyCircle");
	Shape s2 = new Triangle(20,3,"MyTriangle");
	Triangle t1 = new Triangle(2,3,"MyTriangle");
	Triangle t2 = new Triangle(5,3,"MyTriangle");
	Art a = new Triangle2(2,3,"MyTriangleArt");
	a = new CircleBasic(5,"MyCircleArt");
	a = new Shape("ArtShape");
	
	
	System.out.println(s.getName());
	System.out.println(cb1.getArea());
	
	boolean flag = false;
	flag = cb1.equals(cb2);
	if(flag) {
		System.out.println("Boolean val is " + flag);
		System.out.println(cb1.toString());
		System.out.println(cb2.toString());
		System.out.println(cb1.hashCode() + " " + cb2.hashCode());
	}else {
		System.out.println("Boolean val in else is " + flag);
	}
	
	System.out.println();
	
	System.out.println(s2.getName());
	System.out.println(tr.getArea());
	
	flag = false;
	flag = t1.equals(t2);
	int compare = t1.compareTo(t2);
	
	System.out.println("Compare = " + compare);
	if(flag) {
		System.out.println("Boolean val is " + flag);
		System.out.println(t1.toString());
		System.out.println(t2.toString());
		System.out.println(t1.hashCode() + " " + t2.hashCode());
	}else {
		System.out.println("Boolean val in else is " + flag);
	}
	
	System.out.println(a.animate("fast"));
	
	
	try {
//		s2.setColor("Black");
		s2.print();
		}catch(UnPrintableException e) {
			System.out.println("Go to Big Printer");
		}catch(NoColorException e) {
			System.out.println("No Color Exception thrown");
		}catch(BlackAndWhiteOnlyException bw) {
			System.out.println("B&W Error Thrown");
		}catch(Exception e) {		
			System.out.println("Error - Didn't print please check");
		}finally {
			System.out.println("Always Executed");
		}	
	System.out.println("Rest of Program");
	}
}

