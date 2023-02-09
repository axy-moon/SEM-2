import java.util.Scanner;
public class c2f {
    public static void main(String[] args) {
        double cel;
        System.out.print("Celsius: ");
        Scanner sc = new Scanner(System.in);
        cel = sc.nextDouble();
        double far = cel * 9/5 + 32;
        System.out.println("Farenheit: " + far + "F");

    }
}