package com.lpu.homework;

@FunctionalInterface
interface calc{
	void add(int a, int b);
}

//calc with conventional class definition
class conv implements calc{
	@Override
	public void add(int a, int b){
		int sum = a + b;
		System.out.println("Conventional: " + sum);
	}
}

public class DemoLabdaExpression {
	public static void main(String[] args) {		
		
		//calc with Anonymous class
		calc obj = new calc(){
			public void add(int a, int b) {
				int sum = a+b;
				System.out.println("Anonymous: " + sum);
			}
		};
		obj.add(3, 4);
		
		
		//calc with conventional class
		conv obj1 = new conv();
		obj1.add(3,4);
		
		
		//calc with lambda expression
		calc obj2 = (int a,int b) ->{
			int sum = a + b;
			System.out.println("Lambda: " + sum);
		};
		obj2.add(3,4);
		
		
	}
}



//@FunctionalInterface
//interface A {
//	void show();
//}

//class B implements A {
//public void show() {
//System.out.println("Showing Interface A");
//}
//}


//public class DemoLabdaExpression {
//public static void main(String[] args) {
//	A a=new A(){//Anonymous Class - Class without definition
//		public void show() {
//			System.out.println("Showing Interface A");
//		}
//	}; //applicable till java 7
//	a.show();
	
	////Lambda Expressions
//	A a =()->{
//		System.out.println("Show of Interface A from lambda expression");
//	};
//	a.show();
