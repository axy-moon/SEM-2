import java.util.Scanner;

public class Min2sec {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in)

        int min = sc.nextInt();
        convert(min);
    }

    static void convert(int mins) {
            System.out.println("Seconds: " + mins*60);
    }
}