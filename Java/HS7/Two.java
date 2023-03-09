class Rectangle {
    private float length=;
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

    public getPerimeter() {
        return 2*(this.length+width);
    }

    public String toString() {
        return "Rectangle[length="+length+",width="+width+"]";
    }


}


class Two {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(10.0,20.0);

        
        System.out.println("Enter New Length for the Rectangle 1: ");
        r1.getLength();
    }
}