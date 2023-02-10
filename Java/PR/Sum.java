import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        sumOfTwoNumbers(a,b);

}

static void sumOfTwoNumbers(int a,int b) {
    System.out.prinln("Sum: " + a+b);
}

}