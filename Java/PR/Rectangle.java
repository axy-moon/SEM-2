import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int b = sc.nextInt();

        findPerimeter(l,b);

}

static void findPerimeter(int l,int b) {
    System.out.println("Perimeter: " + 2*(l+b));
}

}