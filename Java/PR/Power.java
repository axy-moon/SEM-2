import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        power(a,b);

}

static void power(int a,int b) {
    System.out.println("Power: " + a*b);
}

}