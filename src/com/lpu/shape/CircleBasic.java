package com.lpu.shape;


public class CircleBasic extends Shape implements Comparable{
	private double radius;
//	private String color;
//	private String name = "Circle";

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea(){
        double area=0;
        area = 3.14*radius*radius;
        return area;
    }
	
//	public String getName() {
//		return name;
//	}

   public CircleBasic(){
        radius = 10.4;
    }
    
   public CircleBasic(double radius, String name){
    	super(name);
    	this.radius = radius;
    }
   	
   @Override
   public boolean equals(Object obj) {
	   CircleBasic cb = (CircleBasic)obj;
	   boolean flag = this.radius == cb.radius;
	   return flag;
   }
   
   @Override
   public int hashCode() {
	   return (int)this.radius;
   }
   
   @Override
   public String toString() {
	   return this.radius + " " + super.toString();
   }
   
   @Override
   public int compareTo(Object o) {
	   CircleBasic e = (CircleBasic) o;
	   return (int)this.radius - (int)e.getRadius();
   }
}

//CircleBasic(double radius, String color){
//this.radius=radius;
//this.color=color;















// class CircleBasic { 
//     double radius ;
//     String color;
    
//     CircleBasic(){
//     radius = 10.4;
//     }
    
//     CircleBasic(double radius){
//     this.radius = radius;
    
//     }
    
//     CircleBasic(double radius, String color){
//     this.radius = radius;
//     this.color = color;
//     }
    
//     double getArea(){
//     double area = 0;
//     area = 3.14 *radius* radius; 
//     return area;
//     }
    
//     public static void main(String[] args){
//     CircleBasic cb = new CircleBasic();
//     CircleBasic cb2 = new CircleBasic(11.5);
//     CircleBasic cb3 = new CircleBasic(12.5);
//     // CircleBasic cb4 = new CircleBasic(14.5, "red");
    
//      double area = cb.getArea();
//      double area11 = cb2.getArea();
//      double area12 = cb3.getArea();
    
//     System.out.println("Area 10.5 is " + area);
//     System.out.println("Area 11.5 is " + area11);
//     System.out.println("Area 12.5 is " + area12);
//     }
    
//     }