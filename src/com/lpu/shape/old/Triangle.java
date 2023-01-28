package com.lpu.shape;

class Triangle{
    private double height;
    private double radius;

    Triangle(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    void getArea() {
        System.out.println(0.5 * height * radius);
    }

    public static void main(String[] args) {
        System.out.println("Triangle Class");
    }
}