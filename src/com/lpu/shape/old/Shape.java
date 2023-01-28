package com.lpu;

import com.lpu.shape.CircleNew;

public class Shape {
    public static void main(String[] args) {
        CircleNew c1 = new CircleNew(8.4);
        System.out.println("The Area is " + c1.getArea());
        Triangle t1 = new Triangle(1, 4);
        System.out.print("The Area of triangle is ");
        t1.getArea();
        Calculator calc1 = new Calculator(7, 8);
        System.out.println("The Sum is " + calc1.Sum());
        System.out.println("The Difference is " + calc1.Subtract());
        System.out.println("The Product is " + calc1.Multiply());
        System.out.println("The Quotient is " + calc1.divide());
    }

}

class Calculator {
    double a;
    double b;

    Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    double Sum() {
        return (a + b);
    }

    double Multiply() {
        return (a * b);
    }

    double Subtract() {
        return (a - b);
    }

    double divide() {
        return (a / b);
    }
}