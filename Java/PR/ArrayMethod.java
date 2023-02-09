import java.util.Scanner;

public class ArrayMethod {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int size = sc.nextInt();

        int[] ary = new int[size];

        System.out.println("Enter the elements of the array: ");

        for(int i=0; i<size; i++) {
         ary[i] = sc.nextInt();
        }
        arr(ary);
    }

    static void arr( int [] A) {
        System.out.println("First Element is: " + A[0]);
    }

}