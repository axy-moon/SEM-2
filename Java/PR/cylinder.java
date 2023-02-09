import java.util.Scanner;

public class cylinder {
    public static void main(String[] args)
    {
        final float pi = 3.14f;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Radius: ");
        float rad = sc.nextFloat();
        
        System.out.print("Length: ");
        float len = sc.nextFloat();

        float area =  pi*rad*rad;
        System.out.println("Area  : " + area);
        System.out.println("Volume : " + area*len);
        
    }
}