	class Shape {
		   public void display1() {
		      System.out.println("shape");
		   }
		}
		class Rectangle extends Shape {
		   public void display2() {
		      System.out.println("Rectangle");
		   }
		}
		class circle extends Rectangle {
		   public void display3() {
		      System.out.println("circle");
		   }
		}
		class triangle extends circle {
		   public void display4() {
		      System.out.println("triangle");
		   }
		}

		class Inheritance {
		   public static void main(String[] arguments) {
		      triangle obj =  new triangle();
		      obj.display1();
		      obj.display2();
		      obj.display3();
		      obj.display4();
		   }
		}
