

public class Circle {
    double radius;

    Circle(double radius){
        this.radius=radius;
    }

    double getArea(){
    return(3.14*radius*radius);
    }

    void getPerimeter(){
        System.out.println(2*3.14*radius);
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(4.3);
        System.out.println("Area is " + c1.getArea());
        c1.getPerimeter();
    }
}
