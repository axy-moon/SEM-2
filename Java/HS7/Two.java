import java.util.*;

class Rectangle {
    private float length;
    private float width;

    public Rectangle(float length,float width) {

        this.length = length;
        this.width = width;

    }

    public Rectangle() {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return this.length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return this.width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea() {
        return this.length*this.width;
    }

    public double getPerimeter() {
        return 2*(this.length+this.width);
    }

    public String toString() {
        return "Rectangle[length="+this.length+",width="+this.width+"]";
    }


}


class Two {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(10.0f,20.0f);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length for the Rectangle 1: ");
        float length = sc.nextFloat();
        r1.setLength(length);

        System.out.print("Enter Width for the Rectangle 1: ");
        float width = sc.nextFloat();
        r1.setWidth(width);

        System.out.print("\nEnter New Length for the Rectangle 2: ");
        length = sc.nextFloat();
        r2.setLength(length);

        System.out.print("Enter New Width for the Rectangle 2: ");
        width = sc.nextFloat();
        r2.setWidth(width);


        System.out.println("\nPerimeter of Rectangle 1: " + r1.getPerimeter());
        System.out.println("Area of Rectangle 1: " + r1.getArea());
        System.out.println();

        System.out.println("Perimeter of Rectangle 2: " + r2.getPerimeter());
        System.out.println("Area of Rectangle 2 : " + r2.getArea());

        System.out.println("String: " + r1.toString());

    }
}