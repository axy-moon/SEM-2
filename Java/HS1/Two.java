import java.util.Scanner;

public class Two {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a<=b && b<=c)
            System.out.println("YOU WIN");
        else
            System.out.println("YOU LOSE");


    }
}