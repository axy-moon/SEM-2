import java.util.Scanner;

public class SameNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();

        isSameNum(a,b);
}

    static void isSameNum(int a,int b) {
            if(a==b) System.out.println("True");
            else System.out.println("False");
    } 

}