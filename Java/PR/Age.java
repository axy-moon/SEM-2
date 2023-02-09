import java.util.Scanner;

public class Age {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        calcAge(age);
    }

    static void calcAge(int age) {
        System.out.println(age*365);
    }

}



