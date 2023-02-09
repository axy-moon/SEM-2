import java.util.Scanner;

public class Addition {
     
    static void addition(int a) {
        System.out.println(a+1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int a = in.nextInt();
        addition(a);
    }

   
}