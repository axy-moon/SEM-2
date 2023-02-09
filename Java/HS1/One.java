import java.util.Scanner;

public class One {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(lessThan100(a,b));

    }
    static boolean lessThan100(int a , int b) {
        if (a+b<100) 
            return true;
        else 
            return false;
    }
}