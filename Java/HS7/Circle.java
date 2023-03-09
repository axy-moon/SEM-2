import java.lang.Math.*;
import java.util.*;

public class Circle {
    private double radius;
    private String color = "red";

    Circle() {
        this.radius = 5.0;
    }

    Circle(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return this.radius;
    }

    double getArea(double radius) {
        return 3.14*radius*radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();

        Circle c1 = new Circle();
        Circle c2 = new Circle(r);

        System.out.println("Default Constructor Radius: " + c1.getRadius());
        System.out.println("Area: " + c1.getArea(c1.getRadius()));

        System.out.println("Parameter Radius " + c2.getRadius());
        System.out.println("Area: " + c2.getArea(c2.getRadius()));


    }
}