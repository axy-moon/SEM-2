public abstract class Shape {

    private int x;
    private int y;

    public double calculateArea() {
        return area;
    }

    public double calculateCircumference() {
        return circum;
    }
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return this.radius;
    }

    void setRadius(double radius) {
        this radius = radius;
    }
}